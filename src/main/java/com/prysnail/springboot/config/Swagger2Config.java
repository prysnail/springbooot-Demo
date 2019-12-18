package com.prysnail.springboot.config;

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
 * Swagger 配置类
 * @author prysnail
 * @date 2019/12/18 20:41
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket creteRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.prysnail.springboot.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 构建 api文档详细信息
     * @return
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Spring Boot Swagger2 构建RESTful APIS")
                .description("Spring Boot整合Swagger")    //简介
                .termsOfServiceUrl("")  //服务条款
                .contact("Prysnail")    //个人信息
                .version("1.0")     //版本
                .build();
    }
}
