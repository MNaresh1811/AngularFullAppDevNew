package com.stackroute.keepnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;

@SpringBootApplication
public class UserAuthenticationServiceApplication {



	@Bean
	ApiInfo apiInfo() {
		final ApiInfoBuilder builder = new ApiInfoBuilder();
		builder.title("Spring Boot API for User Authentication Service").version("1.0").license("(C) Sroute")
				.description("List of all endpoints used in API");
		return builder.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(UserAuthenticationServiceApplication.class, args);
	}
}
