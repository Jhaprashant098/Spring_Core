package com.springCore.standalone.collections;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springCore/standalone/collections/aloneconfig.xml");
	Person person1=con.getBean("person1",Person.class);	
	System.out.println(person1);
	System.out.println("---------------------------------");
	System.out.println(person1.getFeeStructure());
	System.out.println("---------------------------------");
	System.out.println(person1.getProp());
	}

}
