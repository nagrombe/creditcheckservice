package com.retailbank.creditcheckservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CreditCheckController {
    private final CreditCheckService creditCheckService;

    @PostMapping("/credit-scores")
    public CreditCheckResponse doCreditCheck(@RequestBody CreditCheckRequest creditcheckRequest) {
        return creditCheckService.doCreditCheck(creditcheckRequest.getCitizenNumber());
    }
}
