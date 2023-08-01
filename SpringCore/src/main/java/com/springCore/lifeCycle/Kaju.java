package com.springCore.lifeCycle;

public class Kaju {
	
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("setting price");
	this.price = price;
}

public Kaju() {
	super();
	  
}

@Override
public String toString() {
	return "Kaju [price=" + price + "]";
}
public void init() {
	System.out.println("inside init method");
}
public void destroy() {
	System.out.println("inside destroy method");
}

}
