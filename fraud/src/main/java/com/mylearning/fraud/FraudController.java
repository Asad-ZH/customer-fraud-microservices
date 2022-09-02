package com.mylearning.fraud;

import com.mylearning.clients.fraud.FraudCheckResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fraud-check")
@AllArgsConstructor
public class FraudController {
    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "/{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable(("customerId")) Integer customerId) {

        boolean isFraudulentCustomer = fraudCheckService.isFraudsterCustomer(customerId);

        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
