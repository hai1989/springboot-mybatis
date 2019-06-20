package org.spring.springboot.service;

import org.spring.springboot.entity.User;

import java.util.List;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.service
 * ClassName:     UserService
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/17 18:18
 * Author         gaohaijiang
 * Version        V1.0.0
 */
public interface UserService {

    public List<User> findAllUser();
}
