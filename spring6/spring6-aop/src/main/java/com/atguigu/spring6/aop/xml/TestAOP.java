package com.atguigu.spring6.aop.xml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanaop.xml");

        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(1,2);
    }
}

