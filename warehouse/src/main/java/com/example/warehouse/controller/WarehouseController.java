package com.example.warehouse.controller;

import com.example.warehouse.model.Part;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/warehouse")
@CrossOrigin("*")
public class WarehouseController {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping
    public List<Part> warehouse() {
        return List.of(new Part(1L, "Name1", 2L),
                new Part(2L, "name2", 3L));
    }
}
