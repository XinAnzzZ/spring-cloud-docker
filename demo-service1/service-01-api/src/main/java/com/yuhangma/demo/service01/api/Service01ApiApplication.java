package com.yuhangma.demo.service01.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Moore
 * @since 2019-07-03
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.yuhangma.demo")
public class Service01ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Service01ApiApplication.class, args);
    }

}
