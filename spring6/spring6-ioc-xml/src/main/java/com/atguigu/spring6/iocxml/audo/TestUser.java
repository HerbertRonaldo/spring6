package com.atguigu.spring6.iocxml.audo;

import com.atguigu.spring6.iocxml.audo.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean-auto.xml");

        UserController userController = context.getBean("userController", UserController.class);
        userController.addUser();
    }
}
