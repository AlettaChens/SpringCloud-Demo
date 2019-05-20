package com.example.serverconfigcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer //开启配置中心
public class ServerConfigCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerConfigCenterApplication.class, args);
    }
}
