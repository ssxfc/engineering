package com.rtos.it.controller;

import com.rtos.it.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhangwenwu
 * @Date 2024/5/7 22:35
 * @Version 1.8
 */
@Controller
public class BookController
{
    @GetMapping("/books")
    public ModelAndView books() {
        //图书列表
        List<Book> books = new ArrayList<Book>();
        //创建图书
        Book book1 = new Book(1,"一个王者","橘白");
        //创建图书，并赋值
        Book book2 = new Book();
        book2.setId(2);
        book2.setName("两个棋子");
        book2.setAuthor("未知");
        books.add(book1);
        books.add(book2);
        //创建回传视图对象
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("books",books);
        //设定视图名，也就是前端页面名称
        modelAndView.setViewName("books");
        return modelAndView;
    }
}