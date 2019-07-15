package com.xdq.bootvue1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BootVue1Application {

    public static void main(String[] args) {
        /*SpringApplicationBuilder builder = new
        SpringApplicationBuilder(BootVue1Application.class) ;
        builder.application().setAdditionalProfiles("prod");
        builder.run(args);*/
        SpringApplication.run(BootVue1Application.class, args);
    }

}
