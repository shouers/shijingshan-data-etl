package com.ubdi.web.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = {"com.ubdi.web"})
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.ubdi" })
@MapperScan("com.ubdi.dao.mapper")
public class MainWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainWebApplication.class, args);
    }

}
