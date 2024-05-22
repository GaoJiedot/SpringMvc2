package com.gj.controller;

import com.gj.domian.User;
import com.gj.domian.User1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class UserController {
    @RequestMapping("getUserId")
    public void getUserId(HttpServletRequest request){
      String userId=request.getParameter("userId");
        System.out.println("userId"+userId);

    }
    @RequestMapping("getUernameAndId")
    public void getUernameAndId(String username,Integer id){
        System.out.println(username+"===="+id);
    }
    @RequestMapping("/registerUser")
    public void registerUser(User user){
        System.out.println(user.getUsername()+"===="+user.getPassword());
    }
    @RequestMapping("/showOrderWithUser")
    public void showOrderWithUser(User1 user1){
        System.out.println(user1.getUsername()+"==="+user1.getPassword()+"==="+user1.getOrder().getOrderId());
    }
}
