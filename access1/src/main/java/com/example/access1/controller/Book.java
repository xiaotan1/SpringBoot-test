package com.example.access1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class Book {


    @PostMapping("/")
    @CrossOrigin(value = "http://localhost:8080",maxAge = 1800,allowedHeaders = "*")
    public String addBook(String name ){
        System.out.println("name");
        return "receive:"+name;
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(value = "http://localhost:8080",maxAge = 1800,allowedHeaders = "*")
    public String deleteBo(@PathVariable Long id){
        System.out.println("delete");
        return String.valueOf(id);
    }

}

