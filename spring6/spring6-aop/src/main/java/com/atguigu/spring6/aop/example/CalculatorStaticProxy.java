package com.atguigu.spring6.aop.example;

public class CalculatorStaticProxy implements Calculator{
    private Calculator calculator;    // 将被代理的目标对象声明为成员变量

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {

        System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);     // 附加功能由代理类中的代理方法来实现

        int addResult = calculator.add(i, j);     // 通过目标对象来实现核心业务逻辑

        System.out.println("[日志] add 方法结束了，结果是：" + addResult);

        return addResult;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
