package com.miniblog.web;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.miniblog"})
public class MiniblogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniblogWebApplication.class, args);
    }

}
