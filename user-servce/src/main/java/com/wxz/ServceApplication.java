package com.wxz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.wxz.mapper")
public class ServceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServceApplication.class,args);
    }
}
