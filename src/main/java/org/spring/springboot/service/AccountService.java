package org.spring.springboot.service;

import org.spring.springboot.entity.Account;

import java.util.List;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.service
 * ClassName:     AccountService
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/17 13:15
 * Author         gaohaijiang
 * Version        V1.0.0
 */
public interface AccountService {

    public List<Account> findAllAccount();

    public  Account findAccountByName(String  accountName);
}
