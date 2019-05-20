package com.example.sleuthzipkinclient2.controller;


import com.example.sleuthzipkinclient2.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {
    @Autowired
    ShowService helloService;

    @GetMapping(value = "/show1")
    public String hi() {
        return helloService.showMessage();
    }


    @GetMapping(value = "/showOK2")
    public String hi2() {
        return "OK2";
    }
}
