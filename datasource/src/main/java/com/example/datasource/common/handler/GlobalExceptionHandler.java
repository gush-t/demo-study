package com.example.datasource.common.handler;

import com.example.datasource.common.CommonResult;
import com.example.datasource.constant.ExceptionEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice(basePackages = "com.example.datasource.controller")
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(Exception.class)
    public CommonResult exception(HttpServletRequest request,
                                  Exception ex){
        return CommonResult.error(ExceptionEnum.SYS_ERROR.getCode(),ExceptionEnum.SYS_ERROR.getMessage());
    }
}
