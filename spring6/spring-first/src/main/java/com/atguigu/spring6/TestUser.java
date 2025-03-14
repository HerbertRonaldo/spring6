package com.atguigu.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    // 创建logger对象
    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject(){

        // 加载spring配置文件，创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 获取创建的对象
        User user = (User)context.getBean("user");
        System.out.println(user);

        // 使用对象 调用方法进行测试
        user.add();

    }



}
