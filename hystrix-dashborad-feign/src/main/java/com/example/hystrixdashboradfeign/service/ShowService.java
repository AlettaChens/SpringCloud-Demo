package com.example.hystrixdashboradfeign.service;

import com.example.hystrixdashboradfeign.component.ErrorHandleHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-provider", fallback = ErrorHandleHystrix.class)//声明断路状态的处理类，以及指明负载均衡的请求接口
public interface ShowService {
    @RequestMapping(value = "/showMessage", method = RequestMethod.GET)
    String showMessage();
}
