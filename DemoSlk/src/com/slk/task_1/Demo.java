package com.slk.task_1;

import java.util.ArrayList;
import java.util.List;



class Demo 
{
	public static List<String> list = new ArrayList<String>();
	
	//public static Demo d;
public static Demo modifications(String str) {
	list.add(str);
	return new Demo();
	
}

public static void main(String[] args) {
	Demo.modifications("asasdd").modifications("asd").modifications("asdasd");
	
	System.out.println(list);
}
	
	
}
