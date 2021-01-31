package org.springframework;

import org.springframework.config.ContextConfig;
import org.springframework.pojo.UserModule;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextApplication {

	public static void main(String[] args) {
		System.out.println("start...........");

		long startTime = System.currentTimeMillis();

		System.out.println("start time: " + startTime + " nano millions");


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ContextConfig.class
		);

		UserModule bean = context.getBean(UserModule.class);

		System.out.println("info: " + bean.toString());


		long endTime = System.currentTimeMillis();

		System.out.println("end time: " + endTime + " nano millions");

		System.out.println("elapsed time: " + (endTime - startTime) + " nano millions");


	}
}
