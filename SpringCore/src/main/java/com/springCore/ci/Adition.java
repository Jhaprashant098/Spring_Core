package com.springCore.ci;

public class Adition {
	private int a;
	private int b;
	
	public Adition(int a,int b) {
		this.a= a;
		System.out.println("constructor int =" + this.a);
		this.b=b;
		System.out.println("constructor int =" + this.a);
		System.out.println("constructor : int, int");
	}
	public Adition(double a,double b) {
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("constructor : double , double");
	}
public void doSum() {
	System.out.println("sum is="+(this.a+this.b));
}
public Adition(String a,String b) {
	this.a=Integer.parseInt(a);
	System.out.println("constructor String =" + this.a);
	this.b=Integer.parseInt(b);
	System.out.println("constructor String =" + this.b);
	
}
}
