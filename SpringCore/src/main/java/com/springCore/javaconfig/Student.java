package com.springCore.javaconfig;

import org.springframework.stereotype.Component;

@Component("jc")
public class Student {

	public void study() {
		System.out.println("student is writting");
	}
}
