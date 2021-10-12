package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring_boot")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){

        return "helloWorld Spring Boot！这是一个用Spring Boot开发的网站。";
    }
}
