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
   分为实例化，属性赋值，初始化，销毁4个阶段
   BeanFactory -> getBean() ->instance -> 对象
   属性赋值 -> (依赖注入 DI) -> 初始化，给属性进行初始化设置
   -> AOP代理 -> bean 就是AOP代理对象 ->销毁
   @Autowired  byType 查询出的结果唯一，直接使用，不需要查看name
   如果多个，byName进行查询，没有匹配的Bean,报错
   @Resource 是Jdk中的注解  byName 判断是否存在bean的名字，key值唯一
   如果不存在，则进行byType进行查询，不存在，报错

2. Springboot 自动装配的流程？
   AutowiredAnnotationBeanPostProcessor
   属性和方法扫描

### 2.MybatisPlus 分页无效
问题分析：没有进行相关的拦截器配置
参考文档：https://mp.baomidou.com/guide/interceptor.html
#### 衍生学习点：
1. MybatisPlusInterceptor拦截器是通过什么方式实现的？
   
2. mybatisPlus 默认开启缓存了么？
   默认开启一级缓存，二级缓存需要手动设置
   
3. mybatisPlus 事务管理方式有哪几种？
   两种事务管理方式
   Jdbc事务隔离级别
   事务工厂Managed
   
### Mapper 中的标签
Mapper.xml 文件是mapper.java类中方法的实现，实现方式是什么？

方法关键点：方法参数，方法名，方法返回类型
#### 方法级别
有关参数的标签

有关方法名及类型的标签

有关方法返回值类型的标签

   


