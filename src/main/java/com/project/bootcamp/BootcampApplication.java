package com.project.bootcamp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class BootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI(@Value("${application.title}") String title, @Value("${application.version}") String version) {
		return new OpenAPI().info(new Info()
							.title(title)
							.version(version)
							.termsOfService("http://swagger.io/terms")
							.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
}