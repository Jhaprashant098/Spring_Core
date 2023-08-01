package com.springCore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Student {
	@Value("prashant jha")
private String studentName;
	@Value("gwalior")
private String city;
	
	@Value("#{temp}")
private List<String> friends;

public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", city=" + city + ", friends=" + friends + "]";
}


}
