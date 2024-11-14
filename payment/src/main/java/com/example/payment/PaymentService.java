package com.example.payment;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface PaymentService {

    @GetExchange("/sendEmail")
    public String get(@RequestParam String email);

}
