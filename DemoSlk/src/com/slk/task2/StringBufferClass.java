package com.slk.task2;

import java.util.Iterator;

public class StringBufferClass {

	public void appendMethod() {

		StringBuffer sb = new StringBuffer("Hello");
		sb.append("tarun");
		System.out.println(sb);
	}

	public void insertMethod() {

		StringBuffer sb = new StringBuffer("Hello");
		sb.insert(1, "tarun");
		System.out.println(sb);
	}

	public void replaceMethod() {

		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(1, 3, "tarun");
		System.out.println(sb);
	}

	public void deleteMethod() {

		StringBuffer sb = new StringBuffer("Hello");
		sb.delete(1, 3);
		System.out.println(sb);
	}

	public void reverseMethod() {

		StringBuffer sb = new StringBuffer("Hello");
		sb.reverse();
		System.out.println(sb);
	}

	public void capacityMethod() {

		StringBuffer sb = new StringBuffer();

		System.out.println("===>> Buffer Default Capacity " + sb.capacity());

		sb.append("Hello");
		System.out.println("Now ==>>" + sb.capacity());
	}

	public void ensureCapacityMethod() {

		System.out.println("===>>  -------- Buffer ensureCapacity() method ");

		StringBuffer sb = new StringBuffer();

		System.out.println("===>> default value ensureCapacity() method  " + sb.capacity());

		sb.append("1234567891234567");
		System.out.println("Now  1 ==>>" + sb.capacity());

		sb.append("123456789123456789");
		System.out.println("old Capicity < current capicity then increse capicity ==>>" + sb.capacity());// now
																											// (16*2)+2=34
																											// i.e
																											// (oldcapacity*2)+2

		sb.ensureCapacity(35);// now (34*2)+2

		System.out.println(sb.capacity());// now 70

	}

	final StringBuffer append = new StringBuffer();

	void append(int val ) {
		append.append(String.valueOf(val));
		
	System.out.println(append);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBufferClass stringBufferClass = new StringBufferClass();
//		stringBufferClass.appendMethod();
//		stringBufferClass.insertMethod();
//		stringBufferClass.replaceMethod();
//		stringBufferClass.deleteMethod();
//		stringBufferClass.reverseMethod();
//		stringBufferClass.capacityMethod();
//		
//		stringBufferClass.ensureCapacityMethod();

		
//
//		new Thread(() -> stringBufferClass.append(1)).start();
//		new Thread(() -> stringBufferClass.append(2)).start();
//		new Thread(() -> stringBufferClass.append(3)).start();
//		new Thread(() -> stringBufferClass.append(4)).start();
//		new Thread(() -> stringBufferClass.append(5)).start();
		
		
		String tr = "Hiii tarun dfsd  sdf  sd  sdf  sdf  sdf  sdf  sf"
				+ "";
		String[] aa = tr.split("\\s");
		
		for(String str :aa) {
			System.out.println(str);
			
			
			
			
			
			
			
		}
		
		

	}

}
