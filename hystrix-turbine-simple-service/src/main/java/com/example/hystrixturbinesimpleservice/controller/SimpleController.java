package com.example.hystrixturbinesimpleservice.controller;

import com.example.hystrixturbinesimpleservice.service.SimpleService;
import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @Autowired
    SimpleService simpleService;

    @RequestMapping(value = "/simple", method = RequestMethod.GET)

    public String simpleString() {
        return simpleService.simpleMethod();
    }


}
