package com.woniu.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BaseConfig {
    @LoadBalanced
    @Bean
    public RestTemplate initRestTemplate(){
        return new RestTemplate();
    }
}
