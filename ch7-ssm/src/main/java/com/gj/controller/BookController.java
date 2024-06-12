package com.gj.controller;


import com.gj.domain.Book;
import com.gj.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.xml.ws.RequestWrapper;

@Controller
public class BookController {
    @Resource
    private BookService bookService;
    @RequestMapping("/getBookById")
    public ModelAndView getBookById (Integer id){
       Book book= bookService.selectBookById(id);
        ModelAndView mv=new ModelAndView();
       mv.addObject( "book",book);
       mv.setViewName("book.jsp");

        return mv;
    }
}
