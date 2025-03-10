package com.atguigu.spring6.re.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "myUserDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.printf("dao......");
    }
}
