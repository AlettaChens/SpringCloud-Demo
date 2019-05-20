package com.example.sleuthzipkinclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShowService {
    @Autowired
    RestTemplate restTemplate;

    public String showMessage() {
        return restTemplate.getForObject("http://SLEUTH-SIMPLE2/showOK2", String.class);
    }
}
