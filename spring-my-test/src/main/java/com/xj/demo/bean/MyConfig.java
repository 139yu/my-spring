package com.xj.demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean
	public UserBean userBean(){
		return new UserBean();
	}
}
