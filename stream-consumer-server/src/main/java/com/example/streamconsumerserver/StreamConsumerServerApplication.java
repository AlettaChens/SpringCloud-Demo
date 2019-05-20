package com.example.streamconsumerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamConsumerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerServerApplication.class, args);
    }
}
