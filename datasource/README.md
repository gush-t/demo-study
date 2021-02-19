# 工程简介
## 问题记录
### 启动报错：Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required
    网上查找资料没有解决，查看github上的问题记录，发现是版本问题
    将sharding-jdbc和mybatisplus都升级到最新版，该问题解决
### 启动报错：An attempt was made to call a method that does not exist. The attempt was made from the following lo
    问题原因分析：guava jar 在maven仓库中有两个版本
    版本冲突了，swagger pom 依赖注释掉，重启好了，
    解决版本依赖冲突的方法：https://blog.csdn.net/m0_37125796/article/details/86149423
### 注意事项
    mybatis中 数据库中字段和实体类中的字段关系
    驼峰下划线，实体类中是驼峰，数据库表中就加下划线
    详细配置：https://baomidou.com/config/#configuration-2
# 延伸阅读

