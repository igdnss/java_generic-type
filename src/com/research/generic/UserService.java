package com.research.generic;

public interface UserService<T> {
	void findById(T id);
}
