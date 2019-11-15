package com.qf.cloud041_shiro_dept_p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Cloud041ShiroDeptPApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cloud041ShiroDeptPApplication.class, args);
    }

}
