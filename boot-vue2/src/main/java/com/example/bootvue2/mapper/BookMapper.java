package com.example.bootvue2.mapper;


import com.example.bootvue2.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface BookMapper {

    int addBook(Book book) ;
    int deleteBookByid(Integer id);
    int updateBookByid(Book book) ;
    Book getBookByid(Integer id) ;
    List<Book> getAllBooks() ;


}
