package com.gezhi.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author EkKo
 * @title: Swagger
 * @projectName springboot
 * @description: TODO
 * @date 2019/10/17/13:56
 */
@Configuration
public class Swagger {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .forCodeGeneration(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gezhi.demo"))
                .paths(PathSelectors.any()).build();
    }

    /**
     * ApiInfo
     *
     * @return 返回ApiInfo
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("api文档")
                .description("HelloWord")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }
}
