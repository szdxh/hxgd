package com.hxgd.onemap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


import tk.mybatis.spring.annotation.MapperScan;


@MapperScan(basePackages="com.hxgd.onemap.dao")
@ComponentScan(basePackages="com.hxgd.onemap")
@ServletComponentScan
@SpringBootApplication
public class OneMapApplication extends SpringBootServletInitializer{

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OneMapApplication.class);
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(OneMapApplication.class, args);
	}

}
