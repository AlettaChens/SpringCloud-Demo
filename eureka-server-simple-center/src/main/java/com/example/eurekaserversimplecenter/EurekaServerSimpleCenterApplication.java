package com.example.eurekaserversimplecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //声明服务注册中心
public class EurekaServerSimpleCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSimpleCenterApplication.class, args);
    }
}
