package com.springcloud.paymentservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String helloEureka() {
        return "Hello Eureka!";
    }
}
