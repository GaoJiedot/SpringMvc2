package com.gj.dao;

import com.gj.domain.Book;

import java.util.List;

public interface BookDao{
    public Book selectBookById(Integer id);
}
