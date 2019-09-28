package com.retailbank.creditcheckservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class CreditCheckResponse {
    @Getter
    @Setter
    private Score score;

    @Getter
    private String uuid;

    public enum Score {
        LOW, HIGH
    }
}
