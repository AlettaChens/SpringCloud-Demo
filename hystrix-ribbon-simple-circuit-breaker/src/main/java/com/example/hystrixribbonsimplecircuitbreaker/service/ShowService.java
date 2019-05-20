package com.example.hystrixribbonsimplecircuitbreaker.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShowService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorHandle")//指明断路处理函数

    //获取服务数据
    public String show() {
        return restTemplate.getForObject("http://SERVICE-PROVIDER/showMessage", String.class);
    }


    //短路处理函数
    public String errorHandle() {
        return "error";
    }
}
