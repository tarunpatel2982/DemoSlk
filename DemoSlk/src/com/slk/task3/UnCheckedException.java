package com.slk.task3;

public class UnCheckedException extends Exception {

	int id;

	public UnCheckedException(int  x) {
		id = x;
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
			return "Custome Exception [" + id + "]";
	}

	
	
}
