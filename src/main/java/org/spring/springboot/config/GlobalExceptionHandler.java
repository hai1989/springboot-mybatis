package org.spring.springboot.config;

import org.spring.springboot.common.Result;
import org.spring.springboot.util.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.config
 * ClassName:     GlobalExceptionHandler
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/12 16:41
 * Author         gaohaijiang
 * Version        V1.0.0
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result exceptionHandler(HttpServletRequest req, Exception e){

        return ResultUtil.error("1","fail");
    }

}
