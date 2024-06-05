package com.gj.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DataController {
    @RequestMapping("showdc")
    public  void showDc(HttpServletResponse response){

        try{
            response.getWriter().println("uuuu");
            response.getWriter().println("uuu");
            response.getWriter().println("网易a");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
