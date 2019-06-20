package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CompanyDao;
import org.spring.springboot.entity.Company;
import org.spring.springboot.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.service.impl
 * ClassName:     CompanyServiceImpl
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/17 17:37
 * Author         gaohaijiang
 * Version        V1.0.0
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyDao  companyDao;

    @Override
    public Company findCompanyByName(String name) {
        return companyDao.findCompanyByName(name);
    }

    @Override
    public List<Company>  findAllCompany() {
        return companyDao.findAllCompany();
    }
}
