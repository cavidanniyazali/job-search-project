package com.practice.jobsearchproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.practice.jobsearchproject.config.security.service")
public class JobSearchProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobSearchProjectApplication.class, args);
    }
}