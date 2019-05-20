package com.example.zuulfiltercenterserver;

import com.example.zuulfiltercenterserver.component.TokenExistFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulFilterCenterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulFilterCenterServerApplication.class, args);
    }


    @Bean
    public TokenExistFilter tokenExistFilter() {
        return new TokenExistFilter();
    }
}
