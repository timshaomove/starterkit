package com.tims.starterkit.config;

import com.tims.starterkit.common.BaseSwaggerConfig;
import com.tims.starterkit.common.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by macro on 2019/4/8.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.tims.starterkit.controller")
                .title("starterkit脚手架")
                .description("基于SpringBoot的项目开发基本框架")
                .contactName("")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

}
