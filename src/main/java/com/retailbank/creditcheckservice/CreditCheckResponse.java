package com.retailbank.creditcheckservice;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class CreditCheckResponse {
    @Getter
    @Setter
    private Score score;

    @Getter
    private String uuid = UUID.randomUUID().toString();

    public CreditCheckResponse(Score high) {
        score = high;
    }

    public enum Score {
        LOW, HIGH
    }
}
