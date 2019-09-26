package com.eureka.microservice.Helloserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/server")
public class HomeApi {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/client/name")
    public String getClientName()
    {
        String url="http://hello-client/client/name";
        return restTemplate.getForObject(url,String.class);
    }
}
