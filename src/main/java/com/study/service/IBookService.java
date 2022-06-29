package com.study.service;

import com.study.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBookService {
    int addBook(Books books);
    int updateBook(Books books);
    int deleteBookById(Integer id);
    List<Books> queryAll(Books books);
    Books queryById(Integer id);
}
