package com.study.mapper;

import com.study.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {
    int addBook(Books books);
    int updateBook(Books books);
    int deleteBookById(@Param("id") Integer id);
    List<Books> queryAll(Books books);
    Books queryById(@Param("id") Integer id);
}
