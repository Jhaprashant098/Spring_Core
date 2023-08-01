package com.springCore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Kishmis implements InitializingBean,DisposableBean {
private double price ;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("setting Properties");
	this.price = price;
}

public Kishmis() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Kishmis [price=" + price + "]";
}


public void afterPropertiesSet() throws Exception {
	System.out.println("taking kismis init");
	
}

public void destroy() throws Exception {
	
	System.out.println("taking kismis destroy");
}
}
