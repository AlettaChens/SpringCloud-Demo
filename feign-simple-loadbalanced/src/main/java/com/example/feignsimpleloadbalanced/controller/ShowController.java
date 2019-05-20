package com.example.feignsimpleloadbalanced.controller;

import com.example.feignsimpleloadbalanced.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {
    @Autowired
    ShowService showService;

    @RequestMapping(value = "/feignshow", method = RequestMethod.GET)
    public String show() {
        return showService.showMessage();
    }
}
