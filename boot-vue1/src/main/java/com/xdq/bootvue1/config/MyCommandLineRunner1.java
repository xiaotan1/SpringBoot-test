package com.xdq.bootvue1.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 启动时加载，实现CommandLineRunner，走run方法。
 * 根据Order（）中的数字来进行顺序加载
 */
@Component
@Order(1)
public class MyCommandLineRunner1 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--------------------> MyCommandLineRunner1");
    }
}
