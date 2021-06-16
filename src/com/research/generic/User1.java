package com.research.generic;

public class User1<T> {
	private T name;
	private T school;
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getSchool() {
		return school;
	}
	public void setSchool(T school) {
		this.school = school;
	}
	
}
