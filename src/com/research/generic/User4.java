package com.research.generic;

public class User4<F> {
	//这里虽然指定了T,但调用的时候可以与泛型类指定的类型不一样
	public static <T> void say1(T value) {
		System.out.println(value);
	}
	public static <E> void say2(E value) {
		System.out.println(value);
	}
}
