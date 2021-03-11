# 工程简介
Springboot +  MybatisPlus 
实现增删改查，简单的小Demo
# 延伸阅读
## BUG
### 1.Failed to determine a suitable driver class
BUG分析：Bean的实例化过程，在create数据源的过程中，读取application.yml
文件中的datasource properties属性时出错
可能的原因分析：空格是否正确；attribute属性使用是否正确；


