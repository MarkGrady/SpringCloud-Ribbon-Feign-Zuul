package com.qf.cloud041_shiro_emp_p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Cloud041ShiroEmpPApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cloud041ShiroEmpPApplication.class, args);
    }

}
