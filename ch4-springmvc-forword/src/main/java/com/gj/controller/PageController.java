package com.gj.controller;

import com.gj.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

public class PageController {
    @RequestMapping("register")
    public void register(){
        System.out.println("11111");
    }
    @RequestMapping("showNoData")
    public String showNoData(){
        System.out.println("22222");
        return "forward:showNoData.jsp";
    }
    @RequestMapping("showNoDatan")
    public String showNoDatan(){
        System.out.println("22222n");
        return "redirect:https://www.nbufe.edu.cn/zsb/";
    }
    @RequestMapping("login")
    public String login(String name, HttpServletRequest request){
        request.setAttribute("ni",name);
        return "main.jsp";
    }
    @RequestMapping("/showModelAndView")
    public ModelAndView showModelAndView(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username","wangyia");
        User user = new User();
        user.setName("TTT");
        user.setPwd("qweasda");
        modelAndView.addObject( "user",user);
        return modelAndView;
    }
}

