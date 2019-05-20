package com.example.ribbonsimpleloadbalanced.controller;

import com.example.ribbonsimpleloadbalanced.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {
    @Autowired
    ShowService helloService;

    @GetMapping(value = "/show")
    public String hi() {
        return helloService.showMessage();
    }
}
