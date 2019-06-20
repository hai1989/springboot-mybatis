package org.spring.springboot.dao;

import org.spring.springboot.entity.Company;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.dao
 * ClassName:     CompanyDao
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/17 17:21
 * Author         gaohaijiang
 * Version        V1.0.0
 */
@Repository
public interface CompanyDao {

    public Company findCompanyByName(String name);

    public  List<Company>   findAllCompany();
}
