package com.project.rain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.project.rain.mapper")
@SpringBootApplication
public class RainApplication {

    public static void main(String[] args) {
        SpringApplication.run(RainApplication.class, args);
    }

}
