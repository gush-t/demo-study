package com.example.demo03nacosprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @GetMapping("/consumer")
    public void consumerTest(){
        //获取服务
        ServiceInstance serviceInstance;
        List<ServiceInstance> list = discoveryClient.getInstances("demo-03-provider");
        serviceInstance = list.size() > 0 ? list.get(0): null;
        if (serviceInstance == null){
            new IllegalStateException("获取不到服务实例");
        }
        String targetUrl = serviceInstance.getUri() + "/user";
        System.out.println(targetUrl);
        String response = restTemplate.postForObject(targetUrl,"hello",String.class);
        System.out.println(response);
    }

}
