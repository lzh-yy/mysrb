package com.atguigu.mysrb.core.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;

/**
 * @author lzhCreate
 * @create 2021-08-26 8:42
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket testApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("testApi")
                .apiInfo(testApiInfo())
                .select()
                .paths(Predicates.and(PathSelectors.regex("/.*")))
                .build();
    }

    @Bean
    public Docket adminApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("adminApi")
                .apiInfo(adminApiInfo())
                .select()
                .paths(Predicates.and(PathSelectors.regex("/.*")))
                .build();
    }

    private ApiInfo adminApiInfo() {
        return new ApiInfoBuilder()
                .title("积分等级-Api文档")
                .description("本文档描述了积分等级的功能")
                .version("1.0")
                .build();
    }

    private ApiInfo testApiInfo() {
        return new ApiInfoBuilder()
                .title("测试Swagger2-Api文档")
                .description("本文档描述了Swagger2的效果")
                .version("1.0")
                .contact(new Contact("小可爱", "www.baidu.com", "a@qq.com"))
                .build();
    }
}
