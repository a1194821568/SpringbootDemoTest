package com.zhanghui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.zhanghui.mapper")
@SpringBootApplication
@EnableSwagger2 //swagger注解
@EnableScheduling
public class SpringbootDemoTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoTest2Application.class, args);
	}

}
