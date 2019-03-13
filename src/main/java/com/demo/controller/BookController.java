package com.demo.controller;

import com.demo.dao.BookDao;
import com.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookDao bookDao;

    @RequestMapping("/showBook")
    @ResponseBody
    public Book toBookIndex(HttpServletRequest request, Model model){
        int bId = Integer.parseInt(request.getParameter("id"));
        System.out.println("bookid ====== " + bId);
        Book book = bookDao.selectByPrimaryKey(bId);
        return book;
    }

}
