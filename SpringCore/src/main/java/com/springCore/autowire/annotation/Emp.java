package com.springCore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("inside setting method");
		this.address = address;
	}

	public Emp(Address address) {
		super();
		System.out.println("inside constructor");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}
