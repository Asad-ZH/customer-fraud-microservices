package com.mylearning.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {


    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public boolean isFraudsterCustomer(Integer customerId) {

        fraudCheckHistoryRepository.save(FraudCheckHistory.builder()
                .CustomerId(customerId)
                .isFraudster(false)
                .createdDate(LocalDateTime.now())
                .build());
        return false;
    }
}
