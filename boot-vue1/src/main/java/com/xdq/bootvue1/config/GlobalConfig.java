package com.xdq.bootvue1.config;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 *  全局数据
 */
@ControllerAdvice
public class GlobalConfig {

    @ModelAttribute(value = "info")
    public Map<String,String> userInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("name","阿斯顿");
        map.put("year","2019");
        return map;
    }

    @InitBinder("book")
    public void init(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("book.");
    }

}
