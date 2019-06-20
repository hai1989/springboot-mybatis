package org.spring.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.spring.springboot.common.Result;
import org.spring.springboot.entity.Account;
import org.spring.springboot.service.AccountService;
import org.spring.springboot.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.controller
 * ClassName:     AccountRestController
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/17 13:20
 * Author         gaohaijiang
 * Version        V1.0.0
 */
@RestController
@Slf4j
public class AccountRestController {

    @Autowired
    private AccountService  accountService;
    @Autowired
    private Account  account;


    @RequestMapping(value = "/api/accounts",method = RequestMethod.GET)
    public Result  findAllAccounts(){
        List<Account> list = accountService.findAllAccount();
        log.info(JSON.toJSONString(list));
        return ResultUtil.success(list);
    }

    @RequestMapping(value = "/api/accountByName" ,method = RequestMethod.GET)
    public  Result  findOneAccountByName(String  name){
        return  ResultUtil.success(accountService.findAccountByName(name));
    }
}
