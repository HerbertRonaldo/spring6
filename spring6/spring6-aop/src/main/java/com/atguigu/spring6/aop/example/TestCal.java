package com.atguigu.spring6.aop.example;

public class TestCal {
    public static void main(String[] args) {

        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());   // 创建代理对象

        Calculator calculator = (Calculator)proxyFactory.getProxy();

        calculator.add(1,2);

    }
}
