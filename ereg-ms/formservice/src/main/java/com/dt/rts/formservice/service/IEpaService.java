package com.dt.rts.formservice.service;

import com.dt.rts.formservice.dto.StateDTO;

import java.util.Optional;

public interface IEpaService {

    Optional<StateDTO> getState(String stateName, String accessToken);
}
