package com.example.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MybatisApplication {
	@RequestMapping("/")
	String home(){
		return "demo";
	}
	public static void main(String[] args) {
	    SpringApplication.run(MybatisApplication.class, args);
	}

}
