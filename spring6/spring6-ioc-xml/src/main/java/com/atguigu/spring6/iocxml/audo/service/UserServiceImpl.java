package com.atguigu.spring6.iocxml.audo.service;

import com.atguigu.spring6.iocxml.audo.dao.UserDao;
import com.atguigu.spring6.iocxml.audo.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("UserService方法调用了");
        userDao.addUserDao();     // 调用Dao中的方法
    }
}
