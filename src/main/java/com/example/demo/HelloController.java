package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @GetMapping("/users")
    public String home() {
        return "Home Page Running Successfully!";
    }

    @GetMapping("/about-devops")
    public String devops() {
        return "DevOps Microservice Running!";
    }

    @GetMapping("/about-aws")
    public String aws() {
        return "AWS Microservice Running!";
    }

    @GetMapping("/about-kubernetes")
    public String kubernetes() {
        return "Kubernetes Microservice Running!";
    }
    @Autowired
        private RestTemplate restTemplate;

    @GetMapping("/user-payment")
    public String userPayment() {

    String response =
            restTemplate.getForObject(
                    "http://payment-service:8082/payments",
                    String.class);

    return "User Service -> " + response;
    }
}
