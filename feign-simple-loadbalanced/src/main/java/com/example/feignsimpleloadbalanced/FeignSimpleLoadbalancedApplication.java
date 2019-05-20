package com.example.feignsimpleloadbalanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients  //声明一个feign客户端
public class FeignSimpleLoadbalancedApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignSimpleLoadbalancedApplication.class, args);
    }
}
