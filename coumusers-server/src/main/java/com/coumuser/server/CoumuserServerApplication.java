package com.coumuser.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
// 开启远程调用注解
@EnableFeignClients(basePackages = "com.coumuser.server.service")
public class CoumuserServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoumuserServerApplication.class, args);
    }
}
