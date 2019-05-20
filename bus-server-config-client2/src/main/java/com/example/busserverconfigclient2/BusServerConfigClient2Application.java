package com.example.busserverconfigclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //声明服务客户端
public class BusServerConfigClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(BusServerConfigClient2Application.class, args);
    }
}
