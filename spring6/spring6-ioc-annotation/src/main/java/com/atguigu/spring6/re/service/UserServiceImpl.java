package com.atguigu.spring6.re.service;

import com.atguigu.spring6.autowired.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "myUserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao myUserDao;

    @Override
    public void add() {
        System.out.println("service.......");

        myUserDao.add();
    }
}
