package com.atguigu.spring6.autowired;

import com.atguigu.spring6.autowired.controller.UserComntroller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.aot.ApplicationContextAotGenerator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserController {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        UserComntroller comntroller = context.getBean(UserComntroller.class);
        comntroller.add();

    }
}
