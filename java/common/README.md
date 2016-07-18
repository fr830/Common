### 1.Mybatis-Generator使用说明
* 源码地址：https://github.com/mybatis/generator
1. 添加包文件(pom.xml文件下含有说明)
2. 打开resources下generatorConfig.xml配置文件
    * 修改jdbcConnection数据库连接字符串
    * 修改javaModelGenerator节点下的targetPackage包为自己项目结构的包
    * 修改sqlMapGenerator模型下的targetPackage包为自己项目结构的包
    * 修改javaClientGenerator模型下的targetPackage包为自己项目结构的包
    * 修改表结构(表名称和生成的实体名称)
3. 执行maven->package，成功，文件生成在target->generated-sources->mybatis-generator下
### 2.Swagger使用说明
* 源码地址：https://github.com/swagger-api/swagger-ui
1. 添加包文件(pom.xml文件下含有说明)
2. 创建spring mvc项目,创建几个控制器(如Home、Login)
3. 创建SwaggerConfig文件，并在添加spring.xml文件
4. 将源码下载下来，将dist下的文件copy到webapp下的apidoc中
5. 启动项目，测试可以访问Swagger是否成功。