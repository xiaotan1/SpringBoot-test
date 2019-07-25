package com.example.bootvue2.service;

import com.example.bootvue2.dao.BookDao;
import com.example.bootvue2.domain.Book;
import com.example.bootvue2.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    /*@Autowired
    BookDao bookDao;*/

    @Autowired
    BookMapper bookMapper;

    public int addBook(Book book){
        return bookMapper.addBook(book);
    }

    public int updateBook(Book book){
        return bookMapper.updateBookByid(book);
    }

    public int deleteBook(int id){
        return bookMapper.deleteBookByid(id);
    }

    public Book getBookByid(Integer id){
        return bookMapper.getBookByid(id);
    }

    public List<Book> getAllBooks () {
        return bookMapper.getAllBooks () ;
    }

}


