package org.spring.springboot.entity;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.entity
 * ClassName:     User
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/13 17:51
 * Author         gaohaijiang
 * Version        V1.0.0
 */
@Data
@Component
public class User {

    private int id;
    private String name;
    private Company company;
    private List<Account> accounts;

}
