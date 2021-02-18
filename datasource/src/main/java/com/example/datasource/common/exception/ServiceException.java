package com.example.datasource.common.exception;

import com.example.datasource.constant.ExceptionEnum;

public class ServiceException extends RuntimeException{
    private final Integer code;


    public ServiceException(ExceptionEnum exceptionEnum) {
        //使用父类中的message方法
        super(exceptionEnum.getMessage());
        this.code = exceptionEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }
}
