package com.research.generic;

public class User3<T> {
	////�����ڷ������ռλ��
	public void say1(T value) {
		System.out.println(value);
	}
	//�����������ռλ��
	public <E> void say2(E value) {
		System.out.println(value);
	}
}
