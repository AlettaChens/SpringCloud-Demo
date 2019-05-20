package com.example.serverconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableEurekaClient
public class ServerConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerConfigClientApplication.class, args);
    }
}
