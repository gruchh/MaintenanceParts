package com.example.shop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping
    public String sayHello() {
        return "Hello World " + instanceId;
    }
}