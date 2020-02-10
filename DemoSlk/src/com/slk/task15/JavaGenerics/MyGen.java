package com.slk.task15.JavaGenerics;

public class MyGen<T> {
	T obj;
	public void add(T obj)
	{
		this.obj=obj;
	}
	public T get()
	{
		return obj;
	}

}
