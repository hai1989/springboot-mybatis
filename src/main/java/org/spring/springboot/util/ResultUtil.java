package org.spring.springboot.util;

import org.spring.springboot.common.Result;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.util
 * ClassName:     ResultUtil
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/12 16:49
 * Author         gaohaijiang
 * Version        V1.0.0
 */
public class ResultUtil {

//    @Autowired
//    private static Result result;

    public  static Result  success(Object data){
        Result  result  =  new Result();
        if(data==null){
            result.setData("无数据");
        }
        else{
            result.setData(data);
        }
        result.setCode("0");
        result.setMessage("success");
        return  result;
    }

    public static  Result error(String code,String message){
        Result  result  =  new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setData("");
        return  result;
    }
}
