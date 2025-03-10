package com.atguigu.spring6.re.controller;

import com.atguigu.spring6.autowired.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller(value = "myUserController")
public class UserComntroller {

    @Resource
    private UserService userService;

    public void add(){
        System.out.println("controller.......");

        userService.add();
    }
}
