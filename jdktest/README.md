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

# 延伸阅读

