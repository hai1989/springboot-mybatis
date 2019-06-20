package org.spring.springboot.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.entity
 * ClassName:     Account
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/13 17:52
 * Author         gaohaijiang
 * Version        V1.0.0
 */
@Data
@Component
public class Account {

    private int id;
    private String accountName;
    private int userId;
}
