package com.example.payment.controller;

import com.example.payment.PaymentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/webhook")
    public String payment(@RequestBody String paymentInfo) throws JsonProcessingException {
        System.out.println(paymentInfo);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(paymentInfo);
        String email = jsonNode.path("data").path("object").path("customer_details").path("email").asText();
        System.out.println(email);
        paymentService.
        return "Hello World";
    }
}