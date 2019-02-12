package com.zds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@ComponentScan(basePackages = "com.zds")
@EnableJpaRepositories(basePackages = "com.zds.dao")
@EntityScan(basePackages = "com.zds.entity")
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}

