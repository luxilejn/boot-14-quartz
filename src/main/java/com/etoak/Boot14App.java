package com.etoak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling 
public class Boot14App {

    public static void main(String[] args) {
        SpringApplication.run(Boot14App.class, args);
    }



}
