package com.xdq.bootvue1.config;

import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Modifier;

/**
 * 创建该类，用来格式化Gson，中使用到的日期类，返回格式：yyyy-MM-dd
 * Gson的jar去掉了，在pom中可见
 */
@Configuration
public class GsonConfig {
    /*@Bean
    GsonHttpMessageConverter gsonHttpMessageConverter() {
        GsonHttpMessageConverter converter= new GsonHttpMessageConverter() ;
        GsonBuilder builder= new GsonBuilder( );
        builder.setDateFormat ("yyyy-MM-dd");
        builder.excludeFieldsWithModifiers(Modifier.PROTECTED) ;
        Gson gson =builder.create() ;
        converter.setGson(gson) ;
        return converter;
    }*/

}
