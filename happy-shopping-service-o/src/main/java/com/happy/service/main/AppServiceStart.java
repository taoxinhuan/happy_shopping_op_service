package com.happy.service.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.happy.service.main.dao")
public class AppServiceStart extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(AppServiceStart.class, args);
	}
	
	/**
	 * 项目打成war包
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		SpringApplicationBuilder sources = application.sources(AppServiceStart.class);
		try {
			sources.web(false).wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return application.sources(sources);
	}
}
