package com.SimpleJavaService.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {
    public String getMessage() {
        return "Hello from SimpleJavaService!";
    }
}
