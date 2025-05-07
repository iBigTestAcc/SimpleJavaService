package com.SimpleJavaService.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {
    public String getMessage() {
        return "Hello from SimpleJavaService!";
    }

    public String processNumber(int input) {
        if (input % 15 == 0) return "FizzBuzz";
        if (input % 3 == 0) return "Fizz";
        if (input % 5 == 0) return "Buzz";
        return String.valueOf(input);
    }
}
