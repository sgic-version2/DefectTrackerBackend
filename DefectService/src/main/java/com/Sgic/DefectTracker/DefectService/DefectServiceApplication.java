package com.Sgic.DefectTracker.DefectService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.Sgic.DefectTracker.DefectService.entities.AttachmentStorageProperties;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EnableConfigurationProperties({AttachmentStorageProperties.class})
public class DefectServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefectServiceApplication.class, args);
	}

}
