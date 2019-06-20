package org.spring.springboot.common;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.common
 * ClassName:     Result
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/12 16:48
 * Author         gaohaijiang
 * Version        V1.0.0
 */

@Data
public class Result {

    private String code;
    private String message;
    private Object  data;

}
