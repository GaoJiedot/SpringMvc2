package com.gj.service.ServiceImpl;

import com.gj.dao.BookDao;
import com.gj.domain.Book;
import com.gj.service.BookService;

import javax.annotation.Resource;

public class BookServicImpl implements BookService {
    @Resource
    private BookDao bookDao;


    @Override
    public Book selectBookById(Integer id) {
        return bookDao.selectBookById(id);
    }
}
