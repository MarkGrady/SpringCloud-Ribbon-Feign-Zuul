package com.qf.cloud041_shiro_dept_c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix //启动熔断服务
@EnableDiscoveryClient
@SpringBootApplication
public class Cloud041ShiroDeptCApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cloud041ShiroDeptCApplication.class, args);
    }

}
