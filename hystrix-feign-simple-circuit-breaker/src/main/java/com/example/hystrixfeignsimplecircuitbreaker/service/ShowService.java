package com.example.hystrixfeignsimplecircuitbreaker.service;

import com.example.hystrixfeignsimplecircuitbreaker.component.ErrorHandleHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-provider", fallback = ErrorHandleHystrix.class)//声明断路处理类
public interface ShowService {
    @RequestMapping(value = "/showMessage", method = RequestMethod.GET)
    String showMessage();
}
