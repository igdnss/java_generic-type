package com.research.generic;

public class User2<T,V> {
	private T name;
	private V school;
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public V getSchool() {
		return school;
	}
	public void setSchool(V school) {
		this.school = school;
	}
	
}
