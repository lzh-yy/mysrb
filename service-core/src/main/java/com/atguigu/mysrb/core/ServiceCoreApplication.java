package com.atguigu.mysrb.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author lzhCreate
 * @create 2021-08-26 8:59
 */
@SpringBootApplication
@MapperScan("com.atguigu.mysrb.core.mapper")
@ComponentScan("com.atguigu")
public class ServiceCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCoreApplication.class);
    }
}
