package org.spring.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.spring.springboot.common.Result;
import org.spring.springboot.entity.Company;
import org.spring.springboot.service.CompanyService;
import org.spring.springboot.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.controller
 * ClassName:     CompanyRestController
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/17 17:30
 * Author         gaohaijiang
 * Version        V1.0.0
 */
@RestController
@Slf4j
public class CompanyRestController {

    @Autowired
    private CompanyService companyService;
    @Autowired
    private Company  company;

    @RequestMapping(value = "/api/companies1",method = RequestMethod.GET)
    public Result  findAllCompany(){
        log.info(companyService.findAllCompany().toString());
        log.info("32424234");
        return ResultUtil.success(companyService.findAllCompany());
    }

    @RequestMapping(value = "/api/companyByName",method = RequestMethod.GET)
    public Result findOneCompany(@RequestParam("name") String name){
        log.info(companyService.findCompanyByName(name).toString());
        return ResultUtil.success(companyService.findCompanyByName(name));
    }
}
