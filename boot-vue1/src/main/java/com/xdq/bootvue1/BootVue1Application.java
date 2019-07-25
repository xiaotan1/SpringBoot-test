package com.xdq.bootvue1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan//次注解配置启动类后，可使用servlet filter和listener
//@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration. class} )
//如果开发者不想使用某个 自动化配置，按如下方式除
//去相关配置即可：
public class BootVue1Application {

    public static void main(String[] args) {
        /*SpringApplicationBuilder builder = new
        SpringApplicationBuilder(BootVue1Application.class) ;
        builder.application().setAdditionalProfiles("prod");
        builder.run(args);*/
        SpringApplication.run(BootVue1Application.class, args);
    }

}
