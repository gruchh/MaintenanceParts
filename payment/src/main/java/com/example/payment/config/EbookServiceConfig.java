package com.example.payment.config;

import com.example.payment.EbookClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class EbookServiceConfig {

    @Bean
    public EbookClient createPaymentClient() {
        RestClient restClient = RestClient.builder()
                .baseUrl("http://EMAIL")
                .build();
        RestClientAdapter restClientAdapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(restClientAdapter).build();
        return factory.createClient(EbookClient.class);
    }

}
