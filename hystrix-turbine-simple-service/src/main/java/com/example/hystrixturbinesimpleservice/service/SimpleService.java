package com.example.hystrixturbinesimpleservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SimpleService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorHandle")
    public String simpleMethod() {
        return restTemplate.getForObject("http://SERVICE-PROVIDER/showMessage", String.class);
    }

    public String errorHandle() {
        return "simpleError";
    }
}
