package com.example.streamproviderserver.controller;

import com.example.streamproviderserver.provider.providerImp.MessageProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactoryController {
    @Autowired
    private MessageProviderImpl messageProvider;

    @GetMapping(value = "/produceMessage/{message}")
    public void ProduceMessage(@PathVariable(value = "message") String message) {
        messageProvider.send(message);
    }
}
