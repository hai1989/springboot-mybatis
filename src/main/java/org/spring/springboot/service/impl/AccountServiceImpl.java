package org.spring.springboot.service.impl;

import org.spring.springboot.dao.AccountDao;
import org.spring.springboot.entity.Account;
import org.spring.springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.service.impl
 * ClassName:     AccountServiceImpl
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/17 13:17
 * Author         gaohaijiang
 * Version        V1.0.0
 */

@Service
public class AccountServiceImpl  implements AccountService {

    @Autowired
    private AccountDao  accountDao;

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    @Override
    public Account findAccountByName(String accountName) {
        return accountDao.findAccountByName(accountName);
    }
}
