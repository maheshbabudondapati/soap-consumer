package com.example.soapconsumer.client;

import com.example.soapconsumer.dto.InputRequest;
import com.example.soapconsumer.dto.ResponseDto;
import com.example.soapconsumer.marshall.Acknowledgement;
import com.example.soapconsumer.marshall.SoapRequest;
import com.example.soapconsumer.request.Request;
import com.example.soapconsumer.request.RequestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Mono;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;
import java.io.IOException;

@Component
@Slf4j
@RequiredArgsConstructor
public class ReactiveSoapClient {

    final WebClient webClient;
    final RequestService requestService;

/*
    public ReactiveSoapClient(WebClient webClient,
                              RequestService requestService) {
        this.webClient = webClient;
        this.requestService = requestService;
    }
*/

    public Mono<Object> call(InputRequest input) throws SOAPException, ParserConfigurationException, IOException {

        SoapRequest customerRequest = new SoapRequest();
        customerRequest.setMessage(input.getMessage());
        Mono<Acknowledgement> ack =  webClient.post()
                .uri( "http://localhost:8091/ws" )
                .contentType(MediaType.TEXT_XML)
                .body( Mono.just(customerRequest) , SoapRequest.class  )
                .retrieve()
                .onStatus(
                        HttpStatus::isError,
                        clientResponse ->
                                clientResponse
                                        .bodyToMono(String.class)
                                        .flatMap(
                                                errorResponseBody ->
                                                        Mono.error(
                                                                new ResponseStatusException(
                                                                        clientResponse.statusCode(),
                                                                        errorResponseBody))))

                .bodyToMono(Acknowledgement.class)
                .doOnError(ResponseStatusException.class, error -> log.error( "error : "+ error ))
                .doOnError(Exception.class, ( Exception error ) -> {
                    log.error( "error : "+ error );
                    error.printStackTrace();
                });




            ack.doOnSuccess( (Acknowledgement response) -> log.info(" success result code : " + response.getResultcode()));

            return ack.map(resp ->{
                Mono<Request> req = requestService.processRequest(input);
                return req.map(re -> ResponseDto.builder().messageId(re.getRequestId()).id(re.getId()).message(re.getMessage()).build());
            });
    }
}