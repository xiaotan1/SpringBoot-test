package com.example.bootvue2.dao;

import com.example.bootvue2.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int addBook(Book book) {
        return jdbcTemplate.update("INSERT INTO book(name , author) VALUES (? , ?) ",
                book.getName(), book.getAuthor());
    }

    public int updateBook(Book book) {
        return jdbcTemplate.update("UPDATE book SET name=?,author=? WHERE id=? ",
                book.getName(), book.getAuthor(), book.getId());
    }

    public int deleteBookByid(Integer id) {
        return jdbcTemplate.update("DELETE FROM book WHERE id = ?", id);

    }

    public Book getBookByid(Integer id) {
        return jdbcTemplate.queryForObject("select * from book where id=? ",
                new BeanPropertyRowMapper<>(Book.class), id);
    }

    public List<Book> getAllBooks() {
        return jdbcTemplate.query("select * from book ",
                new BeanPropertyRowMapper<>(Book.class));
    }
}