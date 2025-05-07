package com.SimpleJavaService.controller;

import com.SimpleJavaService.dto.HelloResponse;
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
    public HelloResponse sayHello() {
        return new HelloResponse(simpleService.getMessage());
    }

    @PostMapping("/fizzbuzz")
    public ResponseEntity<String> fizzBuzz(@RequestBody RequestInt request) {
        String result = simpleService.processNumber(request.getInput());
        if (result == null || result.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(result);
    }
}
