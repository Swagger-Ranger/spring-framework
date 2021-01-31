package org.springframework.config;

import org.springframework.pojo.UserModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("org.springframework.config")
public class ContextConfig {


	@Bean
	public UserModule user() {

		UserModule user = new UserModule();

		user.setId("1");
		user.setUserName("小明");
		user.setAge("18");
		user.setSalary("20000.00");
		user.setWork("架构师");

		return user;
	}
}



