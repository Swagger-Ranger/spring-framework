package org.spring.application.xml;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.pojo.UserModule;

public class ApplicationContextXmlTest {

	public static void main(String[] args) {


		FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("classpath:beans.xml");

		UserModule bean = (UserModule)fileSystemXmlApplicationContext.getBean("userValue");

		System.out.println(" name "+"\t"+bean.getUserName()+"\t"+"salary"+"\t"+bean.getSalary()+"\t"+"job"+"\t"+bean.getWork()+"\t");


	}


}
