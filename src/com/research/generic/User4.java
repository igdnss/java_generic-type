package com.research.generic;

public class User4<F> {
	//������Ȼָ����T,�����õ�ʱ������뷺����ָ�������Ͳ�һ��
	public static <T> void say1(T value) {
		System.out.println(value);
	}
	public static <E> void say2(E value) {
		System.out.println(value);
	}
}
