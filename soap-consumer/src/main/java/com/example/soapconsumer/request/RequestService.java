package com.example.soapconsumer.request;

import com.example.soapconsumer.dto.InputRequest;
import org.springframework.stereotype.Service;


import lombok.AllArgsConstructor;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class RequestService {

	final RequestRepository requestRepository;

	public Mono<Request> processRequest(InputRequest input) {
		Request request = Request.builder().message(input.getMessage()).requestId(input.getId()).build();
		return requestRepository.save(request);
	}

	public Flux<Request> findAll() {
		// TODO Auto-generated method stub
		return requestRepository.findAll();
	}

}
