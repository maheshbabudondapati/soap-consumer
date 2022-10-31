package com.example.soapconsumer.request;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface RequestRepository extends ReactiveCrudRepository<Request, Long> {
   
}