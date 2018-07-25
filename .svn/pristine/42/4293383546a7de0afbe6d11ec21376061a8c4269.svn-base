/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.borrow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author jinlilong
 * @version $Id: Swagger2.java, v 0.1 2018年7月19日 下午2:13:43 jinlilong Exp $
 */
@Configuration
@EnableSwagger2 // 启用Swagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {// 创建API基本信息
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
            .apis(RequestHandlerSelectors.basePackage("org.loan.borrow.controller"))// 扫描该包下的所有需要在Swagger中展示的API，@ApiIgnore注解标注的除外
            .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {// 创建API的基本信息，这些信息会在Swagger UI中进行显示
        return new ApiInfoBuilder().title("借款服务API接口")// API 标题
            .description("借款服务API接口")// API描述
            .version("1.0")// 版本号
            .build();
    }

}
