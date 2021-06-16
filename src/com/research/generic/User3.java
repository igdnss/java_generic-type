package com.research.generic;

public class User3<T> {
	////依赖于泛型类的占位符
	public void say1(T value) {
		System.out.println(value);
	}
	//方法本身持有占位符
	public <E> void say2(E value) {
		System.out.println(value);
	}
}
