package com.slk.practiceExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
	
	static Scanner sc = new Scanner(System.in);
	static String vaString1 =null;
	
	
	public static int addCounter1(int counter1 ,ArrayList<String>array1 )
	{
		
		System.out.print("Counter One Enter people Name : ");
		vaString1 = sc.next();
		array1.add(vaString1);
		System.out.println("..................==>> "
				+ "First Counter Give Ticket   : " + array1);
		counter1--;
		return counter1;
	}
	public static int addCounter2(int counter2 ,ArrayList<String>array2 )
	{
		System.out.print("Counter Two  Enter people Name : ");
		 vaString1 = sc.next();
		array2.add(vaString1);
		System.out.println(".................==>> "
				+ "Second Counter Give Ticket   : " + array2);
		counter2--;
		return counter2;
	}
	public static int addCounter3(int counter3 ,ArrayList<String>array3 )
	{
		System.out.print("Counter Three Enter people Name : ");
		 vaString1 = sc.next();
		array3.add(vaString1);
		System.out.println(".................==>> "
				+ "Third Counter Give Ticket   : " + array3);
		counter3--;
		return counter3;
	}
	public static int addCounter4(int counter4 ,ArrayList<String>array4 )
	{
		System.out.print("Counter Four Enter people Name : ");
		vaString1 = sc.next();
		array4.add(vaString1);
		System.out.println("...................==>> "
				+ "Fourth Counter Give Ticket   : " + array4);
		counter4--;
		return counter4;
	}
	public static void main(String[] args) {
	
		

		System.out.println("First Counter people ==> : ");
		int counter1= sc.nextInt();

		System.out.println("Second Counter people ==> : ");
		int counter2= sc.nextInt();
		
		System.out.println("Third Counter people ==> : ");
		int counter3= sc.nextInt();
		
		System.out.println("Fourth Counter people ==> : ");
		int counter4= sc.nextInt();

		
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();
		ArrayList<String> array4 = new ArrayList<String>();
		
	
		int total = counter1 + counter2 + counter3 + counter4; 
		
		
		
		
		for (int j = 0; j <= total/4; j++) 
		{
			
					if(counter1 != 0)
					{
							counter1 = addCounter1(counter1,array1);
					}
					else
						
					{
					
								if ( counter2>counter3 && counter2>counter4 && counter2>=4 )
								{
									System.out.println("count 2 ");
									counter1 = counter2 /2;
									counter2 -=counter1;
									System.out.println("test Counter One Check : " + counter1 + " test   :" + counter2);
									counter1 = addCounter1(counter1,array1);
									
								}
								else if( counter3>counter2 && counter3>counter4 && counter3>=4)
								{
									System.out.println("count 3");
									counter1 = counter3 /2;
									counter3 -=counter1;
									
									System.out.println("test Counter One Check : " + counter1+ " test   :" + counter3 );
									counter1 = addCounter1(counter1,array1);
								}
								else if( counter4>counter2 && counter4>counter3 && counter4>=4)
								{
									System.out.println("count 4");
									counter1 = counter4 /2;
									counter4 -=counter1;
									
									System.out.println("test Counter One Check : " + counter1 + " test   :" + counter4);
									counter1 = addCounter1(counter1,array1);
								}
							
					}
			
					if( counter2 != 0)	
					{
						counter2 = addCounter2(counter2,array2);
						
					}else
					{
						
							if( counter1>counter3 && counter1>counter4 && counter1>=4)
									{
										System.out.println("count 1");
										
										counter2 = counter1 /2;
										counter1 -=counter2;
										
										System.out.println("test Counter 2 Check : " + counter2+ " test   :" + counter1 );
										counter2 = addCounter2(counter2,array2);
									}
							else if(counter3>counter1 &&  counter3>counter4 && counter3>=4)
							{
								System.out.println("count 3");
								counter2 = counter3 /2;
								counter3 -=counter2;
								
								System.out.println("test Counter 2 Check : " + counter2 + " test   :" + counter3);
								counter2 = addCounter2(counter2,array2);
							}
							else if(counter4>counter1 && counter4>counter3 && counter4>=4)
							{
								System.out.println("count 4");
								counter2 = counter4 /2;
								counter4 -=counter2;
								
								System.out.println("test Counter 2 Check : " + counter2 + " test   :" + counter4);
								counter2 = addCounter2(counter2,array2);
							}
							
					
					}
		
					if(counter3 != 0)
					{
						counter3 = addCounter3(counter3,array3);
					}
					else
					{
							if (counter1>counter2 &&  counter1>counter4 && counter1>=4)
							{
								System.out.println("count 2 ");
								counter3 = counter1 /2;
								counter1 -=counter3;
								
								System.out.println("test Counter 3 Check : " + counter3 );
								counter3 = addCounter3(counter3,array3);
							}
							else if(counter2>counter1 &&  counter2>counter4 && counter2>=4)
							{
								System.out.println("count 3");
								counter3 = counter2 /2;
								counter2 -=counter3;
								
								System.out.println("test Counter 3 Check : " + counter3 );
								counter3 = addCounter3(counter3,array3);
								
							}
							else if(counter4>counter1 && counter4>counter2  && counter4>=4)
							{
								System.out.println("count 4");
								counter3 = counter4 /2;
								counter4 -=counter3;
								
								System.out.println("test Counter 3 Check : " + counter3 );
								counter3 = addCounter3(counter3,array3);
								
							}
						
					}
					if(counter4  != 0)
					{
						counter4 = addCounter4(counter4,array4);
					}
					else
					{
					
				
							if (counter1>counter2 && counter1>counter3  && counter1>=4)
							{
								System.out.println("count 2 ");
								counter4 = counter1 /2;
								counter1 -=counter4;
								
								System.out.println("test Counter 4 Check : " + counter4 );
								counter4 = addCounter4(counter4,array4);
							}
							else if(counter2>counter1 && counter2>counter3  && counter2>=4)
							{
								System.out.println("count 3");
								counter4 = counter2 /2;
								counter2 -=counter4;
								
								System.out.println("test Counter 4 Check : " + counter4 );
								counter4 = addCounter4(counter4,array4);
								
							}
							else if(counter3>counter1 && counter3>counter2 && counter3 >=4)
							{
								System.out.println("count 4");
								counter4 = counter3 /2;
								counter3 -=counter4;
								
								System.out.println("test Counter 4 Check : " + counter4 );
								counter4 = addCounter4(counter4,array4);
								
							}
						
				
					}
					
				System.out.println("-----------------------------------------------------------------------------");
			
		}
		
		System.out.println("Counter 1 Issue Ticket : " + array1);
	
		System.out.println("Counter 2 Issue Ticket : " + array2);
	
		System.out.println("Counter 3 Issue Ticket : " + array3);
	
		System.out.println("Counter 4 Issue Ticket : " + array4);
				
		
		
	}

}
