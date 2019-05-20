package com.example.hystrixturbinesimpleservice2.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SimpleService2 {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorHandle")
    public String simpleMethod2() {
        return restTemplate.getForObject("http://SERVICE-PROVIDER/showMessage", String.class);
    }

    public String errorHandle() {
        return "simpleError";
    }
}
