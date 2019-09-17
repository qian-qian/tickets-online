package com.woniu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        System.out.println("holleo word");
        SpringApplication.run(WebApplication.class, args);
    }

}
