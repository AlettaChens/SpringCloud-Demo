package com.example.streamproviderserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamProviderServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(StreamProviderServerApplication.class, args);
    }
}
