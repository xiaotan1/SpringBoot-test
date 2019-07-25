package com.xdq.bootvue1.controller;


import com.xdq.bootvue1.domain.Book;
import com.xdq.bootvue1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Book book;

    @Autowired
    public UserService userService;

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }


    @RequestMapping("book")
    public String book() {
        return book.toString();
    }


    @RequestMapping("getUser")
    public String getUser(){
        return userService.getUserByid(1);
    }

    @RequestMapping("dUser")
    public void deleteUser(){
        userService.deleteUserByid(1);
    }

}
