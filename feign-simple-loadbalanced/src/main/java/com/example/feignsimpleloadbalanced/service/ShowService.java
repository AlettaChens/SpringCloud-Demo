package com.example.feignsimpleloadbalanced.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-provider")  //声明请求的服务名称
public interface ShowService {
    @RequestMapping(value = "/showMessage", method = RequestMethod.GET)
    String showMessage();
}
