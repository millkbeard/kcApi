package com.kc.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
@MapperScan("com.kc.demo.dao")
public class DemokcApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemokcApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemokcApplication.class);
	}

}