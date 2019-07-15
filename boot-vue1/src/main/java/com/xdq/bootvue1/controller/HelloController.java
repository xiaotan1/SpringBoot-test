package com.xdq.bootvue1.controller;


import com.xdq.bootvue1.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Book book;

    @RequestMapping("hello")
    public String hello() {
        return "12345";
    }


    @RequestMapping("book")
    public String book() {
        return book.toString();
    }



}
