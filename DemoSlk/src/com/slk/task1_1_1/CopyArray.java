package com.slk.task1_1_1;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//declaring source array
		char[] copyForm= {'a','b','c','d','g','h'};
		
		//for each loop
		for(char i:copyForm)
		{
			System.out.println(i);
		}
		///copy array method 
		System.out.println(" ===>>copy array method ");
		
		char[] copyTo = new char[3];
		System.arraycopy(copyForm, 2, copyTo, 0, 3);
		System.out.println(String.valueOf(copyTo));

		
		//clone array method
		System.out.println(" ===>>clone array method ");
		char[] arr = copyForm.clone();
			for(char i : arr)
			{
				System.out.println(i);
			}
	}

}
