package com.atguigu.spring6.autowired.dao;

public class UserRedisDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("dao redis..........");
    }
}
