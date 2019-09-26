package com.eureka.microservice.Helloclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class UserApi {

    @GetMapping("/name")
    public String getName()
    {
        return "Monirozzaman roni";
    }

    @GetMapping("/application")
    public String getApplicationName()
    {
        return "I am Hello client";
    }
}
