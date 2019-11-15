package com.qf.cloud041_eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Cloud041EurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cloud041EurekaserverApplication.class, args);
    }

}
