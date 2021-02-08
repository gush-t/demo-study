package com.example.jdktest.execption;

import com.example.jdktest.constant.ServiceExceptionEnum;

/**
 * 封装统一的异常信息
 */
public final class ServiceException extends RuntimeException{

    private final Integer code;


    public ServiceException(ServiceExceptionEnum serviceExceptionEnum) {
        //使用父类中的message方法
        super(serviceExceptionEnum.getMessage());
        this.code = serviceExceptionEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }
}
