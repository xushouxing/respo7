package com.atguiju.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.atguiju.springboot.mapper")
@EnableCaching
public class SpringbootCachApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCachApplication.class, args);
	}

}
