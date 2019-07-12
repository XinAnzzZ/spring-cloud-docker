package com.yuhangma.demo.service02.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Moore
 * @since 2019-07-04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Service02ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Service02ApiApplication.class, args);
    }

}
