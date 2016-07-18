package com.lyzj.student.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 配置Swagger Api文档
 * Created by kencery on 2016/7/15.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "项目名称(Mybatis下创建)",
                "提供给系统所有使用的Restful接口",
                "版本号为1.0.0.0",
                "http://www.cnblogs.com/hanyinglong",
                "hyl934532778@live.cn",
                "陇原之家",
                "http://www.cnblogs.com/hanyinglong"
        );
        return apiInfo;
    }

    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }

}