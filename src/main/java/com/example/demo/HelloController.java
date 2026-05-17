package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
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
}
