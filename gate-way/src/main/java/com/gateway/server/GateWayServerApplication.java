package com.gateway.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient

public class GateWayServerApplication {
    private static Logger loggerFactory = LoggerFactory.getLogger(GateWayServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(GateWayServerApplication.class, args);
        loggerFactory.info("gate-way 启动成功。。。。。");
    }

    // 动态路由方式
//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder) {
//        return routeLocatorBuilder.routes()
//                .route("demo",r->r.path("/demo/**").uri("http://localhost:9001"))
//                .build();
//
//    }
}
