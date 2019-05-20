package com.example.ribbonsimpleloadbalanced.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShowService {
    @Autowired
    RestTemplate restTemplate;

    public String showMessage() {
        return restTemplate.getForObject("http://SERVICE-PROVIDER/showMessage", String.class);
    }
}
