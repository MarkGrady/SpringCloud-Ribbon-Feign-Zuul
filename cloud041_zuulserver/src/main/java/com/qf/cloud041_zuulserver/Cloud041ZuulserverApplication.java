package com.qf.cloud041_zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class Cloud041ZuulserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cloud041ZuulserverApplication.class, args);
    }

}
