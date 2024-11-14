package com.example.payment;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface EbookClient {

    @GetExchange("/sendEmail")
    void sendEmail(@RequestParam String email);

}
