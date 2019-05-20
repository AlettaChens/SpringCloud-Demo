package com.example.hystrixturbinesimpleservice2.controller;


import com.example.hystrixturbinesimpleservice2.service.SimpleService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @Autowired
    SimpleService2 simpleService2;

    @RequestMapping(value = "/simple", method = RequestMethod.GET)

    public String simpleString() {
        return simpleService2.simpleMethod2();
    }


}
