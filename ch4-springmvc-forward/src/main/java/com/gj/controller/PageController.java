package com.gj.controller;

import com.gj.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {

    @RequestMapping("register")
    public void registera(){
        System.out.println("1111111111");
    }
    @RequestMapping("showNoData")
    public String showNoData(){
        System.out.println("2222222");
        return "forward:showNoData.jsp";
    }

    @RequestMapping("showNoDatan")
    public String showNoDatan(){
        System.out.println("2222222n");
        return "redirect:http://www.baidu.com";
    }

    @RequestMapping("login")
    public String login(String name, HttpServletRequest request){
        request.setAttribute("n1",name);
        return "main.jsp";
    }
    @RequestMapping("showModelAndview")
    public ModelAndView showModelAndview(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("username","gg");
        User user = new User();
        user.setName("ttt");
        user.setPwd("sdhadass");
        mv.addObject("user",user);
        mv.setViewName("maina.jsp");
        return mv;
    }
}
