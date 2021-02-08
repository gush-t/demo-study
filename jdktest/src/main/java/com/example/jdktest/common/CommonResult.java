package com.example.jdktest.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.util.Assert;

import java.io.Serializable;

public class CommonResult<T> implements Serializable {

    /**
     * 统一返回结果封装
     * 成功：示例--> {code :0 ; data:{name:"hello"}}
     * 错误：示例-->{code:1;message:"努力实践"}
     *
     */
    private static final Integer CODE_SUCCESS =0;
    //状态码
    private Integer code;
    //报错时返回的信息
    private String message;
    //成功时的数据信息
    private T data;

    // <T> 表示该方法是泛型方法
    public static <T> CommonResult<T> error(CommonResult<T> result){
        return error(result.getCode(),result.getMessage());
    }

    public static <T> CommonResult<T> error(Integer code, String message) {
        Assert.isTrue(!CODE_SUCCESS.equals(code),"code 状态不能为0");
        CommonResult<T> result = new CommonResult<>();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static <T> CommonResult<T> success(T data){
        CommonResult<T> result = new CommonResult<>();
        result.setCode(CODE_SUCCESS);
        result.setData(data);
        result.setMessage("");
        return result;
    }
    @JsonIgnore
    private  boolean isSuccess(){
        return CODE_SUCCESS.equals(this.code);
    }
    @JsonIgnore
    private boolean isError(){
        return !isSuccess();
    }



    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public CommonResult() {
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
