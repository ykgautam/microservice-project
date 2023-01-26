package com.lcwd.user.service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {

    @Bean
    @LoadBalanced // it uses the service name (i.e HOTEL-SERVICE) instead of service host (i.e localhost:8082)
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
