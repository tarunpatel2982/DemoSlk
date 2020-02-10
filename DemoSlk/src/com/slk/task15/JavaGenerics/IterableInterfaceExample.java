package com.slk.task15.JavaGenerics;

public class IterableInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Integer [] ints = {1, 2, 3};
		 MyIterable<Integer> myList =new MyIterable<Integer>(ints);
		 for (Integer integer : myList) {
			System.out.println("Iterable Value : " + integer);
		}
	}

}
