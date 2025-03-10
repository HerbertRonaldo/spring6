package com.atguigu.spring6.junit.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")   // 指定配置文件的位置
public class TestJunit5 {

    // 注入
    @Autowired
    private User user;


    // 测试方法
    @Test
    public void testUser(){
        System.out.println(user);
        user.run();
    }
}
