package com.theOne.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.text.DecimalFormat;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider.class,args);
    }
}
