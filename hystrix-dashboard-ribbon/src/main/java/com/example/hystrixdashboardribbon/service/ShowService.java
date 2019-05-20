package com.example.hystrixdashboardribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShowService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorHandle")  //声明断路状态处理方法
    public String show() {
        return restTemplate.getForObject("http://SERVICE-PROVIDER/showMessage", String.class);
    }

    public String errorHandle() {
        return "error";
    }
}
