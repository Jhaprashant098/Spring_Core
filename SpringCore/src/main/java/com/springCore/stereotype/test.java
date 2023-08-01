package com.springCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/stereotype/stereoconfig.xml");
Student student=context.getBean("obj",Student.class);
System.out.println(student);
System.out.println(student.getFriends());
System.out.println(student.getFriends().getClass().getName());
}
}
