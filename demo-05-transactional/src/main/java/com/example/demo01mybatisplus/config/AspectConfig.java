package com.example.demo01mybatisplus.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.weaver.tools.PointcutParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Aspect
@Component
public class AspectConfig {

    private  final Logger logger = LoggerFactory.getLogger(getClass());


    /**
     * *.*(..)
     * 任意类.任意方法(任意参数)
     */
    @Pointcut(value = "execution(* com.example.demo01mybatisplus.service.*.*(..))")
    public void recordLogger(){}

    @Around("recordLogger()")
    public void loggerOut(ProceedingJoinPoint joinPoint) throws InterruptedException {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        logger.info("start:{}", methodSignature.getMethod() );
        TimeUnit.SECONDS.sleep(2);
        logger.info("end:{}", methodSignature.getReturnType());
    }
}
