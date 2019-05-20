package com.example.hystrixdashboardribbon.controller;


import com.example.hystrixdashboardribbon.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleShowController {
    @Autowired
    ShowService showService;

    @RequestMapping(value = "/hystrixshow", method = RequestMethod.GET)
    public String showHystrix() {
        return showService.show();
    }
}
