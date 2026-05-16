//package com.example.demo;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class FinalApplication {

	//public static void main(String[] args) {
		//SpringApplication.run(FinalApplication.class, args);
	//}

//}

package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "DevOps Project Running Successfully!";
    }
}
