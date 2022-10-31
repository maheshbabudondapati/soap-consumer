package com.dt.rts.formservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StateDTO {
    private String    state     ;
    private String     level     ;
    private String     mtpStatus     ;
    private Integer     turnaroundTime     ;
    private Integer     lateDays     ;
    private String     lateFeesType         ;
    private String     lateFeesFormula         ;
    private BigDecimal lateFeesFixed         ;
    private boolean    isTwoStep ;
    private boolean    isEreg3DealAssembly ;
    private boolean    isTwoStepIdr ;

}
