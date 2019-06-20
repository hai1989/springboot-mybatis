package org.spring.springboot.service.impl;

import org.spring.springboot.dao.UserDao;
import org.spring.springboot.entity.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.service.impl
 * ClassName:     UserServiceImpl
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/17 18:19
 * Author         gaohaijiang
 * Version        V1.0.0
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao  userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser() ;
    }
}
