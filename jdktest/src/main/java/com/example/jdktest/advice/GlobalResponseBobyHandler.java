package com.example.jdktest.advice;

import com.example.jdktest.common.CommonResult;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice(basePackages = "com.example.jdktest.controller")
public class GlobalResponseBobyHandler implements ResponseBodyAdvice {

    /**
     * 支持类型，直接返回true,只有controller包下所有controller的API
     * @param methodParameter
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        //如果已经是公共返回类型，就不需要包装了
        if(o instanceof CommonResult){
            return o;
        }
        //否则，将数据封装为包装类
        return CommonResult.success(o);
    }
}
