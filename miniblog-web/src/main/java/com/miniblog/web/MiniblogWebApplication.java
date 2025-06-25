package com.miniblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = {"com.miniblog.web","com.miniblog.service","com.miniblog.api","com.miniblog.core"})
class MiniblogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniblogWebApplication.class, args);
    }

}
