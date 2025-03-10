package com.atguigu.spring6.autowired.controller;

import com.atguigu.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserComntroller {

    private UserService userService;

    public UserComntroller(UserService userService) {
        this.userService = userService;
    }

    public void add(){
        System.out.println("controller.......");

        userService.add();
    }
}
