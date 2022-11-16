package com.example.soapconsumer.request;

import lombok.*;
import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties
public class Request {
    @Id
    Integer id;
    String message;
    Integer requestId;
}