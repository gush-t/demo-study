# 工程简介
Springboot +  MybatisPlus 
实现增删改查，简单的小Demo
# 延伸阅读
## BUG
### 1.Failed to determine a suitable driver class
BUG分析：Bean的实例化过程，在create数据源的过程中，读取application.yml
文件中的datasource properties属性时出错
可能的原因分析：空格是否正确；attribute属性使用是否正确；
#### 衍生学习点：
1. Springboot 中Bean的生命周期？
   
2. Springboot 自动装配的流程？


### 2.MybatisPlus 分页无效
问题分析：没有进行相关的拦截器配置
参考文档：https://mp.baomidou.com/guide/interceptor.html
#### 衍生学习点：
1. 拦截器是通过什么方式实现的？
   
2. mybatisPlus 默认开启缓存了么？
   
3. mybatisPlus 事务管理方式有哪几种？



