package com.example.simpleserviceprovide2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SimpleServiceProvide2Application {

    public static void main(String[] args) {
        SpringApplication.run(SimpleServiceProvide2Application.class, args);
    }
}
