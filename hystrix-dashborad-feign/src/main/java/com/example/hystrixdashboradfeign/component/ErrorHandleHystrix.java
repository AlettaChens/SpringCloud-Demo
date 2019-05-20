package com.example.hystrixdashboradfeign.component;


import com.example.hystrixdashboradfeign.service.ShowService;
import org.springframework.stereotype.Component;


//断路的处理类
@Component
public class ErrorHandleHystrix implements ShowService {
    @Override
    public String showMessage() {
        return "breaker";
    }
}
