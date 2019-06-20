package org.spring.springboot.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.entity
 * ClassName:     Company
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/13 17:51
 * Author         gaohaijiang
 * Version        V1.0.0
 */
@Data
@Component
public class Company {

    private int id;
    private String companyName;

}
