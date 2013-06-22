package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public String showNameInjection(){
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringBeans.xml");
		HelloWorld obj=(HelloWorld) context.getBean("injectName");
		return obj.getName();
	}

	public int showAgeInjection(){
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringBeans.xml");
		HelloWorld obj=(HelloWorld) context.getBean("injectAge");
		obj=(HelloWorld) context.getBean("injectName");
		return obj.getAge();
	}

	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringBeans.xml");
		HelloWorld obj=(HelloWorld) context.getBean("injectName");
		obj=(HelloWorld) context.getBean("injectAge");
		obj.printName();
		obj.printAge();
	}
}
