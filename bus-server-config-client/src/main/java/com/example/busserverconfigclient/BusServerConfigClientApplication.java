package com.example.busserverconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //该注解声明一个服务客户端
public class BusServerConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusServerConfigClientApplication.class, args);
    }
}
