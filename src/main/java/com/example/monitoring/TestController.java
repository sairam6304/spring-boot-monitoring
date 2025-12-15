package com.example.monitoring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        Thread.sleep((long)(Math.random() * 500));
        return "Hello Monitoring!";
    }

    @GetMapping("/error")
    public String error() {
        throw new RuntimeException("Simulated error");
    }
}
