package com.gj.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gj.entity.Product;
import com.gj.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DataController {
    @RequestMapping("/showdc")
    public void ShowDC(HttpServletResponse response){
        try {
            response.getWriter().println("uuuuu");
            response.getWriter().println("王");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping("/showjsona")
    public void showjsona(HttpServletResponse response){
        try {
            ObjectMapper om = new ObjectMapper();

            User user = new User();
            user.setId(1213);
            user.setName("王");
            user.setPwd("dgajjshaf");

            String s = om.writeValueAsString(user);
            try {
                response.getWriter().println(s);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping("getUser")
    @ResponseBody
    public User getUser(){
        User user = new User();
        user.setName("王");
        return user;
    }

    @RequestMapping("addProduct")
    @ResponseBody
    public List<Product> addProduct(){
        ArrayList<Product> lists = new ArrayList<>();
        Product p1 = new Product();
        p1.setProId(136183);
        p1.setProName("螃蟹");

        Product p2 = new Product();
        p1.setProId(13615555);
        p1.setProName("哇哈哈");

        lists.add(p1);
        lists.add(p2);

        return lists;
    }
}
