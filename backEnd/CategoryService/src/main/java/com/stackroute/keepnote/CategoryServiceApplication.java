package com.stackroute.keepnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.stackroute.keepnote.jwtfilter.JwtFilter;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;

/*
 * The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration 
 * and @ComponentScan with their default attributes
 */
@SpringBootApplication
public class CategoryServiceApplication {

	/*
	 * Define the bean for Filter registration. Create a new
	 * FilterRegistrationBean object and use setFilter() method to set new
	 * instance of JwtFilter object. Also specifies the Url patterns for
	 * registration bean.
	 */
	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/v1/*");
		return registrationBean;
	}

	@Bean
	ApiInfo apiInfo() {
		final ApiInfoBuilder builder = new ApiInfoBuilder();
		builder.title("Spring Boot API for Category Service").version("1.0").license("(C) Sroute")
				.description("List of all endpoints used in API");
		return builder.build();
	}

	/*
	 * 
	 * You need to run SpringApplication.run, because this method start whole
	 * spring framework. Code below integrates your main() with SpringBoot
	 */

	public static void main(String[] args) {
		SpringApplication.run(CategoryServiceApplication.class, args);
	}
}
