package com.springCore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
private List<String> friends;
private Map<String, Integer>feeStructure;
private Properties prop;

public Properties getProp() {
	return prop;
}

public void setProp(Properties prop) {
	this.prop = prop;
}

public Map<String, Integer> getFeeStructure() {
	return feeStructure;
}

public void setFeeStructure(Map<String, Integer> feeStructure) {
	this.feeStructure = feeStructure;
}

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

@Override
public String toString() {
	return "Person [friends=" + friends + ", feeStructure=" + feeStructure + ", prop=" + prop + "]";
}




}
