package com.example.bootvue2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.bootvue2.mapper")
public class BootVue2Application {

    public static void main(String[] args) {
        SpringApplication.run(BootVue2Application.class, args);
    }

}
