package org.spring.springboot.dao;

import org.spring.springboot.entity.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.dao
 * ClassName:     AccountDao
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/17 13:12
 * Author         gaohaijiang
 * Version        V1.0.0
 */

@Repository
public interface AccountDao {

    public List<Account> findAllAccount();

    public  Account findAccountByName(String  accountName);
}
