package com.xdq.bootvue1.controller.package4;

import com.xdq.bootvue1.domain.Book;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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

    @GetMapping("/helloo")
    @ResponseBody
    public void hello(Model model) {
        Map<String, Object> map = model.asMap();
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Object value = map.get(key);
            System.out.println(key + ">>>" + value);
            //   info>>>{year=2019, name=阿斯顿}
        }
    }

    @GetMapping("/tb.do")
    @ResponseBody
    public void getbdo(@ModelAttribute("book") Book book){

        System.out.println(book.toString());

    }


}
