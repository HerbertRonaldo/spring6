package com.atguigu.spring6.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// 切面类

@Component // IoC容器中管理
public class LogAspect {
    // 前置通知
    public void beforeMethod(){
        System.out.println("logger -> 前置通知");
    }

    // 后置通知
    public void afterMethod(JoinPoint joinPoint){  // 参数JoinPoint切入点，能获取到通知中一些相关信息
        String methodName = joinPoint.getSignature().getName();   // 增强的方法名字
        Object[] args = joinPoint.getArgs();   // 参数
        System.out.println("logger -> 后置通知，方法名称为" + methodName + " 参数为" + Arrays.toString(args));
    }

    //返回通知
    public void afterReturningMethod(JoinPoint joinPoint, Object calResult){
        String methodName = joinPoint.getSignature().getName();   // 增强的方法名字
        Object[] args = joinPoint.getArgs();   // 参数
        System.out.println("logger -> 返回通知，方法名称为" + methodName + " 参数为" + Arrays.toString(args) + "结果是" + calResult);
    }

    // 异常
    public void afterThrowingMethid(JoinPoint joinPoint,Throwable ex){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("logger -> 异常通知，方法名称为" + methodName + " 参数为" + Arrays.toString(args) + "异常是" + ex);
    }

    // 环绕
    public Object aroundMethod(ProceedingJoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        Object result = null;

        try{
            System.out.println("环绕通知，目标方法之前执行");
            result = joinPoint.proceed();   // 调用目标方法
            System.out.println("环绕通知，目标方法返回值之后执行");
        }catch (Throwable throwable){
            throwable.printStackTrace();
            System.out.println("环绕通知，目标方法出现异常时执行");
        }finally {
            System.out.println("目标方法执行完毕");
        }

        return result;
    }


    // 重复使用 切入点表达
    @Pointcut(value = "execution(* com.atguigu.spring6.aop.xml.CalculatorImpl.*(..))")
    public void pointCut(){}

    @Before(value = "com.atguigu.spring6.aop.xml.LogAspect.pointCut()")
    public void beforeMethod1(){
        System.out.println("logger -> 前置通知");
    }




}
