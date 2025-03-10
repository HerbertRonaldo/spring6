package com.atguigu.spring6.re.service;

import com.atguigu.spring6.config.SpringConfig;
import com.atguigu.spring6.re.controller.UserComntroller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserControllerAnno {
    public static void main(String[] args) {

        // 加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);  // 我写的配置类.class

        UserComntroller comntroller = context.getBean(UserComntroller.class);
        comntroller.add();


    }
}










