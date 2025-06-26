package com.miniblog.service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.miniblog")
public class MiniblogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniblogServiceApplication.class, args);
    }
}
