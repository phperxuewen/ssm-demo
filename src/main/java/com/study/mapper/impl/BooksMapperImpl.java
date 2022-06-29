package com.study.mapper.impl;

import com.study.mapper.BooksMapper;
import com.study.pojo.Books;

import java.util.List;

public class BooksMapperImpl implements BooksMapper {

    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public int addBook(Books books) {
        return booksMapper.addBook(books);
    }

    @Override
    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    @Override
    public int deleteBookById(Integer id) {
        return booksMapper.deleteBookById(id);
    }

    @Override
    public List<Books> queryAll(Books books) {
        return booksMapper.queryAll(books);
    }

    @Override
    public Books queryById(Integer id) {
        return booksMapper.queryById(id);
    }
}
