package org.spring.springboot.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.spring.springboot.common.Result;
import org.spring.springboot.service.UserService;
import org.spring.springboot.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.controller
 * ClassName:     UserRestController
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/17 18:20
 * Author         gaohaijiang
 * Version        V1.0.0
 */

@RestController
@Slf4j
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/users",method = RequestMethod.GET)
    public Result  findAllUser(){
        log.info("----------------------"+JSON.toJSONString(userService.findAllUser()));
       return ResultUtil.success(userService.findAllUser());
    }
}
