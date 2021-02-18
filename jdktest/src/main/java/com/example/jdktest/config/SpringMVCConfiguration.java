package com.example.jdktest.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.example.jdktest.common.interceptor.FirstInterceptor;
import com.example.jdktest.common.interceptor.SecondInterceptor;
import com.example.jdktest.common.interceptor.ThirdInterceptor;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

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

    //添加拦截器，日志，权限，访问次数等等
    //前置，后置，完成后的处理

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(firstInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(secondInterceptor()).addPathPatterns("/Worker");
        registry.addInterceptor(thirdInterceptor()).addPathPatterns("/**");
    }

    //FastJson数据序列化
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //创建FastJsonHttpMessageConverter对象
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        //自定义FastJsonConfig
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setCharset(Charset.defaultCharset());
        fastJsonConfig.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect);
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        fastJsonHttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON));
        //EmbeddedWebServerFactoryCustomizerAutoConfiguration
        converters.add(0,fastJsonHttpMessageConverter);

    }


}
