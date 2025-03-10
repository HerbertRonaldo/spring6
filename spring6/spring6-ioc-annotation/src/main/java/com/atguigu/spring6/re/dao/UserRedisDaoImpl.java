package com.atguigu.spring6.re.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "myUserRedisDao")
public class UserRedisDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao redis..........");
    }
}
