package com.example.jdktest.advice;

import com.example.jdktest.common.CommonResult;
import com.example.jdktest.constant.ServiceExceptionEnum;
import com.example.jdktest.execption.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice(basePackages = "com.example.jdktest.controller")
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 服务器类型异常，
     * @param request
     * @param ex
     * @return
     */
    @ExceptionHandler(value = ServiceException.class)
    public CommonResult ServiceExceptionHandler(HttpServletRequest request , ServiceException ex){
        logger.debug("[ServiceException]",ex);
        return CommonResult.error(ex.getCode(),ex.getMessage());
    }



    @ExceptionHandler(value = Exception.class)
    public CommonResult exceptionHandler(HttpServletRequest request , Exception ex){
        logger.debug("[Exception]",ex);
        return CommonResult.error(ServiceExceptionEnum.SYS_ERROR.getCode(),
                ServiceExceptionEnum.SYS_ERROR.getMessage());
    }


}
