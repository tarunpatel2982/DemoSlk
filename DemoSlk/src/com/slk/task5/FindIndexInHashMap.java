package com.slk.task5;

import java.util.Scanner;

public class FindIndexInHashMap {

	public void intdexOfCount(int h,int l)
	{
		int index = h % (l-1);
		System.out.println("print index : "+ index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter HaskCode : ");
		int hashKey = sc.nextInt();
		System.out.println("Enter hasmap length  : ");
		int length = sc.nextInt();
		
		FindIndexInHashMap f = new FindIndexInHashMap();
		f.intdexOfCount(hashKey, length);
	}

}
