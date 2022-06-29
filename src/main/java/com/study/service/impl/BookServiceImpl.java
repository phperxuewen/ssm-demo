package com.study.service.impl;

import com.study.mapper.BooksMapper;
import com.study.pojo.Books;
import com.study.service.IBookService;
import org.springframework.util.StringUtils;

import java.util.List;

public class BookServiceImpl implements IBookService {

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
        if(StringUtils.hasText(books.getBookName())){
            books.setBookName("%"+books.getBookName()+"%");
        }
        return booksMapper.queryAll(books);
    }

    @Override
    public Books queryById(Integer id) {
        return booksMapper.queryById(id);
    }
}
