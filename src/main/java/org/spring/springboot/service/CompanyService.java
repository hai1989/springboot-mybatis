package org.spring.springboot.service;

import org.spring.springboot.entity.Company;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.service
 * ClassName:     CompanyService
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/17 17:31
 * Author         gaohaijiang
 * Version        V1.0.0
 */
public interface CompanyService {

    public Company findCompanyByName(String name);

    public List<Company> findAllCompany();
}
