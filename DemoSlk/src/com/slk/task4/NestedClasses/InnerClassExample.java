package com.slk.task4.NestedClasses;

import java.util.List;

public class InnerClassExample {
	
	
	public void analyze(List<String> data) {

        if (data.size() > 50) {
            //runtime exception
           // throw new ListTooLargeException("List can't exceed 50 items!");
        }

		//...
    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//outer class create object and they are using Inner class Object
		OuterClass outerClass = new OuterClass();
		
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.display();
	}

}
