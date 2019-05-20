package com.example.sleuthzipkinclient.controller;


import com.example.sleuthzipkinclient.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {
    @Autowired
    private ShowService showService;

    @GetMapping(value = "/showOK1")
    public String hi() {
        return "OK1";
    }

    @GetMapping(value = "/show2")
    public String hihi() {
        return showService.showMessage();
    }
}
