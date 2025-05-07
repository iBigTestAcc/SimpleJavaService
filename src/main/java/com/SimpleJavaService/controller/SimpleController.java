package com.SimpleJavaService.controller;

import com.SimpleJavaService.service.SimpleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleController {

    private final SimpleService simpleService;

    public SimpleController(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return simpleService.getMessage();
    }
}
