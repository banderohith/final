package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class test {


    @GetMapping("/test")
    public String Testing() {
        return "Congratualtions Neeraj and Rohit for your deployment ngork";
    }
}
