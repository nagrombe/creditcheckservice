package com.retailbank.creditcheckservice;

import lombok.Getter;
import lombok.Setter;

public class CreditCheckResponse {
    @Getter
    @Setter
    private Score score;

    public CreditCheckResponse(Score high) {
        score = high;
    }

    public enum Score {
        HIGH
    }
}
