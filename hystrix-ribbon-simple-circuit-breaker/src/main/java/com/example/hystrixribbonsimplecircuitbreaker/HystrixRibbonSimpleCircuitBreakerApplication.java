package com.example.hystrixribbonsimplecircuitbreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix  //开启断路器
public class HystrixRibbonSimpleCircuitBreakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixRibbonSimpleCircuitBreakerApplication.class, args);
    }

    @Bean
    @LoadBalanced
        //开启负载均衡
    RestTemplate restTemplate() {//注入RestTemplate
        return new RestTemplate();
    }
}
