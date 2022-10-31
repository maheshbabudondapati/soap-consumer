package com.dt.rts.formservice.service.impl;

import com.dt.rts.formservice.dto.StateDTO;
import com.dt.rts.formservice.service.IEpaService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class EpaServiceImpl implements IEpaService {

    @Value("${spring.epa.url:http://epa-service}")
    private String EPA_URL_;
    @Resource(name = "restClient")
    private RestTemplate restTemplate;

    private static final Logger LOG = LoggerFactory.getLogger(EpaServiceImpl.class);


    @HystrixCommand(fallbackMethod = "getStateFailed", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "60000") })
    public Optional<StateDTO> getState(String stateName, String accessToken) {
        Optional<StateDTO> result = Optional.empty();
        LOG.info("EPAServiceImpl :: getState:{}", stateName);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + accessToken);
        String url = EPA_URL_ + "/state/retrieve?state=" + stateName;
        try{
            ResponseEntity<StateDTO> stateDTOResponseEntity = restTemplate.getForEntity(url, StateDTO.class, headers);
            if (stateDTOResponseEntity.getBody() == null) {
                LOG.error("No state found for the statename :: [{}]", stateName);
            } else {
                result = Optional.ofNullable(stateDTOResponseEntity.getBody());
            }
        } catch (RuntimeException re){
            LOG.error("Exception in FORMSERVICE :: EpaServiceImpl :: URL :: [{}]", url, re);
        }

        return result;
    }

    public Optional<StateDTO> getStateFailed(String stateName, Throwable e) {
        LOG.error("EpaServiceImpl::getState failure  [{}]  and error message :: [{}]", stateName, e.getMessage(), e);
        return Optional.empty();
    }
}

