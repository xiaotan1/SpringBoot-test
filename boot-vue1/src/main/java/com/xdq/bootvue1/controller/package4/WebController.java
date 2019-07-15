package com.xdq.bootvue1.controller.package4;

import com.xdq.bootvue1.domain.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class WebController {

    @RequestMapping("/getBooks")
    public Book getBook() {
        Book book = new Book();
        book.setPrice((float) 20.99);
        book.setName("人间失格");
        book.setAuthor("太宰治");
        book.setPublicationDate(new Date());
        return book;
    }

}
