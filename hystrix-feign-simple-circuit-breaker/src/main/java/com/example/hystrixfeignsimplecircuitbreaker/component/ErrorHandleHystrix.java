package com.example.hystrixfeignsimplecircuitbreaker.component;

import com.example.hystrixfeignsimplecircuitbreaker.service.ShowService;
import org.springframework.stereotype.Component;

@Component
public class ErrorHandleHystrix implements ShowService {
    @Override
    public String showMessage() {
        return "breaker";
    }
}
