# 工程简介
整合springboot+mybatis+rabbit工程学习记录
## 整合中的问题记录
### 问题1：空指针
    业务逻辑层，workerService 没有进行依赖注入@Autowired,导致
    调用中报NullPointException
### 问题2：数据访问层映射绑定异常
    报错信息：
    `org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.example.jdktest.mapper.WorkerMapper.findById`
    导致该问题可能原因分析：
    相关文档：https://www.cnblogs.com/yucongblog/p/7550590.html
    本工程导致该问题的根本原因：是application.yml配置文件mapper 配置项不对
    应该是mapper-locations,我写成了config-locations
### 问题3：插入数据自动增长
    两个要求
    1.数据库支持主键自增，并设置表自动递增，比如mysql数据支持(auto_increment)，Orcale不支持
    2.Mapper.xml文件中 userGeneratedKeys ,keyProperty
    参考：（mybatsi如何配置）https://www.cnblogs.com/hongdada/p/9956992.html
    
# 延伸阅读
## 参考文档
    公共返回结果封装
    http://www.iocoder.cn/Spring-Boot/SpringMVC/?self

