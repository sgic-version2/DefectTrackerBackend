package com.Sgic.DefectTracker.ProductService.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2

public class SwaggerConfig {
	 @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2).select()
	            .apis(RequestHandlerSelectors
	                .basePackage("com.Sgic.DefectTracker.ProductService.controller"))
	            .paths(PathSelectors.regex("/.*"))
	            .build();
	    }
//	 .apiInfo(apiEndPointsInfo())
//	    private ApiInfo apiEndPointsInfo() {
//	        return new ApiInfoBuilder().title("Spring Boot REST API")
//	            .description("DefectTracker  REST API")
//	            .contact(new Contact("Kirikaran", null, null))
//	            .build();
//	    }
//	



}

