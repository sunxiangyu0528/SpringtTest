package com.example.springttest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@MapperScan("com.example.springttest.Mapper")
public class SpringtTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtTestApplication.class, args);
    }

}
