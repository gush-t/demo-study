package com.example.jdktest.config;

import com.example.jdktest.common.interceptor.FirstInterceptor;
import com.example.jdktest.common.interceptor.SecondInterceptor;
import com.example.jdktest.common.interceptor.ThirdInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMVCConfiguration implements WebMvcConfigurer {

    /**
     * 将FirstInterceptor 作为Bean 注入到SpringMVCConfiguration容器中
     * @return
     */
    @Bean
    public FirstInterceptor firstInterceptor(){
        return new FirstInterceptor();
    }
    @Bean
    public SecondInterceptor secondInterceptor(){
        return new SecondInterceptor();
    }
    @Bean
    public ThirdInterceptor thirdInterceptor(){
        return new ThirdInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(firstInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(secondInterceptor()).addPathPatterns("/Worker");
        registry.addInterceptor(thirdInterceptor()).addPathPatterns("/**");
    }
}
