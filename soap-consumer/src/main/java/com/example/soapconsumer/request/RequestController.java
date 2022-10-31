package com.example.soapconsumer.request;

import com.example.soapconsumer.client.ReactiveSoapClient;
import com.example.soapconsumer.dto.InputRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class RequestController {

    final RequestService requestService;

    final ReactiveSoapClient reactiveSoapClient;

    @GetMapping("/requests")
    public Flux<Request> getRequests(){
       return requestService.findAll();
    }
    
    @RequestMapping(value = { "/create", "/" }, method = RequestMethod.POST)
    public Mono<Request> create(@RequestBody InputRequest request) {
    	return requestService.processRequest(request);
    }

    @RequestMapping(value = { "/invoke" }, method = RequestMethod.POST)
    public Mono<Object> invoikeSoapCient(@RequestBody InputRequest input) throws SOAPException, ParserConfigurationException, IOException {
        return reactiveSoapClient.call(input);
    }

}