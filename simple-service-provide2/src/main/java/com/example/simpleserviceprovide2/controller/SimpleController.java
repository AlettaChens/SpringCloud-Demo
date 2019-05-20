package com.example.simpleserviceprovide2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @RequestMapping(value = "/showMessage", method = RequestMethod.GET)
    public String showMessage() {
        return "helloSimple2";
    }
}
