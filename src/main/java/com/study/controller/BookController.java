package com.study.controller;

import com.study.pojo.Books;
import com.study.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private IBookService bookService;

    //查询全部的书籍
    @RequestMapping("/allBook")
    public String list(Books books,Model model){
        List<Books> booksList = bookService.queryAll(books);
        model.addAttribute("list", booksList);
        model.addAttribute("search",books);
        return "allBook";
    }

    @RequestMapping("/addBookPage")
    public String addBookShow(){
        return "addBook";
    }

    @RequestMapping("/addBookDo")
    public String addBookDo(Books books){
        bookService.addBook(books);
        return "redirect:/books/allBook";
    }

    @RequestMapping("/updateBookPage/{id}")
    public String UpdateBookShow(@PathVariable("id") Integer id,Model model){
        Books books = bookService.queryById(id);
        model.addAttribute("book", books);
        return "updateBook";
    }

    @RequestMapping("/updateBookDo")
    public String updateBookDo(Books books){
        bookService.updateBook(books);
        return "redirect:/books/allBook";
    }

    @RequestMapping("/delete/{id}")
    public String updateBookDo(@PathVariable("id") Integer id){
        bookService.deleteBookById(id);
        return "redirect:/books/allBook";
    }

}
