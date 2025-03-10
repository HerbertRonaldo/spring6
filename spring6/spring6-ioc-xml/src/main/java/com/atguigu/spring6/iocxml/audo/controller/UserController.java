package com.atguigu.spring6.iocxml.audo.controller;

import com.atguigu.spring6.iocxml.audo.service.UserService;
import com.atguigu.spring6.iocxml.audo.service.UserServiceImpl;


public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("controller方法执行了");

        userService.addUserService();   // 调用service方法
    }
}
