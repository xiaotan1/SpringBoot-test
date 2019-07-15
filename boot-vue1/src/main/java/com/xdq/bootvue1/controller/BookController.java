package com.xdq.bootvue1.controller;

import com.xdq.bootvue1.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {



    @GetMapping("books")
    public ModelAndView getBooks() {
        List<Book> list = new ArrayList<Book>();
        Book book1 = new Book();
        book1.setAuthor("鲁迅");
        book1.setName("故事新编");
        book1.setPrice((float) 29.991);
        Book book2 = new Book();
        book2.setAuthor("鲁迅1");
        book2.setName("故事新编1");
        book2.setPrice((float) 29.99);
        list.add(book1);
        list.add(book2);

        ModelAndView model = new ModelAndView();
        model.addObject("books", list);
        model.addObject("message", "11");

        model.setViewName("books");
        return model;
    }

}
