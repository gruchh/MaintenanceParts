package com.example.shop.controller;

import com.example.shop.model.Part;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping
    public String sayHello() {
        return "Hello World " + instanceId;
    }

    @GetMapping("/parts")
    public List<Part> partList() {
        List<Part> partList = List.of(new Part(1L, "Part 1", "Producer1", "https://www.creativefabrica.com/wp-content/uploads/2022/12/14/a-piece-of-cheese-cartoon-ilustration-Graphics-52238740-1.jpg"),
                new Part(2L, "Part 2", "Producer 2", "https://www.creativefabrica.com/wp-content/uploads/2022/12/14/a-piece-of-cheese-cartoon-ilustration-Graphics-52238740-1.jpg"));
        return partList;
    }


}
