package org.spring.springboot.dao;

import org.spring.springboot.entity.Account;
import org.spring.springboot.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.dao
 * ClassName:     UserDao
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/17 17:54
 * Author         gaohaijiang
 * Version        V1.0.0
 */
@Repository
public interface UserDao {

    public List<User> findAllUser();

    public  User findUserByName(String  userName);
}
