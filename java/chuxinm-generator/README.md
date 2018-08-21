### 1.chuxinm-generator使用说明
* 源码地址：https://github.com/mybatis/generator
1. 添加包文件(pom.xml文件下含有说明)
2. 如何动态生成Mybatis之Entity、Dao、Mapper
    * 2.1 首先判断您使用的是什么类型的数据库(Mysql/Oracle/SqlServer),然后打开对应的resources下mybatis_generator配置文件
        * 修改jdbc_url数据库连接字符串
        * 修改jdbc_username数据库的用户名
        * 修改jdbc_password数据库的密码
        * 修改modelPackage类路径(实体对应的类路径)
        * 修改sqlMapperPackage类路径(sqlMapper对应的类路径)
        * 修改daoMapperPackage类路径(Dao对应的类路径)
    * 2.2 修改resources下的generatorConfig.xml类型
        * 此文件只需要修改添加您要生成的表信息，配置最下面几行，可添加多个表信息，复制添加即可
        * 需要修改的属性为：table下的tableName此为表名,domainObjectName此为实体的前缀名
3. 如何运行生成，需要配置maven启动运行
    * 选择Edit Configurations,添加maven配置，配置一下几个参数
    * Working directory 配置当前项目路径
    * Command line 配置当前运行命令：mybatis-generator:generator
    * Profiles 配置哪一个数据库访问
4. 配置如下图所示：
![Image text](https://images.chuxinm.com/blog/20180821162537009_67246.png?imageView2/0/q/75|watermark/2/text/Y2h1eGlubS5jb20=/font/YXJpYWw=/fontsize/400/fill/IzAwOTNERA==/dissolve/80/gravity/SouthEast/dx/5/dy/5|imageslim)
