package com.xdq.bootvue1.controller;

import com.xdq.bootvue1.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FreeMarkerController {
    @GetMapping("/books1")
    public ModelAndView books(HttpSession session) {
        session.setAttribute("a", "a");
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setPrice((float)1);
        b1.setAuthor("罗贯中");
        b1.setName("三国演义");
        Book b2 = new Book();
        b2.setPrice((float)2);
        b2.setAuthor("曹雪芹");
        b2.setName("红楼梦");
        books.add(b1);
        books.add(b2);
        ModelAndView mv = new ModelAndView();
        mv.addObject("a", "cc");
        mv.addObject("books", books);
        mv.setViewName("books1");
        return mv;
    }

    @RequestMapping("fBooks")
    public ModelAndView findBooks() {

        List<Book> list = new ArrayList<>();
        Book book = new Book();
        book.setAuthor("太宰治");
        book.setName("人间失格");
        book.setPrice((float) 59.98);

        Book book1 = new Book();
        book1.setAuthor("江南");
        book1.setName("龙族");
        book1.setPrice((float) 59.98);

        list.add(book);
        list.add(book1);

        ModelAndView mo = new ModelAndView();
        mo.addObject("books",list);
        mo.setViewName("books2");
        return mo;
    }
}
