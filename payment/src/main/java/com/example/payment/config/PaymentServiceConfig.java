package com.example.payment.config;

import com.example.payment.PaymentClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;

@Configuration
public class PaymentServiceConfig {

    @Bean
    public PaymentClient createPaymentClient() {
        RestClient restClient = RestClient().builder()
                .baseUrl("https://EMAIL")
                .build();
        RestClientAdapter restClientAdapter = RestClientAdapter.create(restClient);
    }

}
