package com.slk.practiceExample;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo3 {


	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> array1 = new ArrayList<Integer>();
	static ArrayList<Integer> array2 = new ArrayList<Integer>();
	static ArrayList<Integer> array3 = new ArrayList<Integer>();
	static ArrayList<Integer> array4 = new ArrayList<Integer>();
	
	static int counter1 = 0,counter2 = 0,counter3 = 0,counter4 = 0;
	 
	
	
	public static int inputCounterValue()
	{

		int coutValue = sc.nextInt();
		
		
		return coutValue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		while (true) {
		
			System.out.println("Enter Your Choice : ");
			
			System.out.println("1.Add New Countrer Value ");
			System.out.println("2. Existing Column In Add Value ");
			System.out.println("3.Ticket Issue : ");
			
			switch (sc.nextInt()) {
			case 1:
					System.out.println("First Counter people ==> : ");
					 counter1= sc.nextInt();
					 
					System.out.println("Second Counter people ==> : ");
					 counter2= sc.nextInt();
					
					System.out.println("Third Counter people ==> : ");
					 counter3= sc.nextInt();
					
					System.out.println("Fourth Counter people ==> : ");
					 counter4= sc.nextInt();
					
					System.out.println("Call Case 1");
				break;
				
			case 2:
					System.out.println("Select Counter  : ");
					System.out.println("1.First Counter In Enter  No of People : ");
					System.out.println("2.Second Counter In Enter  No of People : ");
					System.out.println("3.Third Counter In Enter  No of People : ");
					System.out.println("4.Fourth Counter In Enter  No of People : ");
					
					int couterValue = 0;
					switch (sc.nextInt()) {
						case 1:
									System.out.print("             ==>>");
									couterValue = inputCounterValue();
									counter1 +=couterValue;
									System.out.println("test 1 co " + counter1);
							break;
						case 2 : 
									System.out.print("             ==>>");
									couterValue = inputCounterValue();
									counter2 +=couterValue;
									System.out.println("test 2 co " + counter2);
						break;
						case 3 :
									System.out.print("             ==>>");
									couterValue = inputCounterValue();
									counter3 +=couterValue;
									System.out.println("test 3 co " + counter3);
						    break;
						case 4 :
									System.out.print("             ==>>");
									couterValue = inputCounterValue();
									counter4 +=couterValue;
									System.out.println("test 4 co " + counter4);
							break;
						
						default:System.out.println("====>>> Wrong Input ");
							break;
					}
					
					
				break;
			case 3:
				
				
					counterProcess();
				break;

			default:System.out.println("====>>>>>   Wrong Input");
				break;
			}

		}
				
		
	}
	
	public static void counterProcess()
	{
		  int total = counter1 + counter2 + counter3 + counter4;
		float val = total/4;
		System.out.println(" total value : " + val);
		for (int j = 0; j <= total/4; j++) 
		{
			
					
								if ( counter1>counter2 && counter1>counter3 && counter1>counter4 && counter2%2==0 )
								{
									System.out.println("count 1 ");
									
									if(counter2==0)
									{
										counter2 = counter1/2;
										counter1 -=counter2;
										System.out.println("counter  2 = 0 ");
									}else if(counter3==0)
									{
										counter3 = counter1/2;
										counter1 -=counter3;
										System.out.println("counter  3 = 0 ");
									}else if(counter4==0)
									{
										counter4 = counter1/2;
										counter1 -=counter4;
										System.out.println("counter  4 = 0 ");
									}else
									{
										System.out.println("Esle ex");
									}
									System.out.println("test Counter One Check : " + counter1 + " test   :" + counter1);
									counter1 = addCounter1(counter1,array1, j);
									System.out.println(" 1  if counter Value  : " + counter1);
								}
								else if(counter1 !=0)
								{
									counter1 = addCounter1(counter1,array1, j);
									System.out.println(" 1  else counter Value  : " + counter1);
								}
								
								 if ( counter2>counter1 && counter2>counter3 & counter2>counter4 && counter2%2==0 )
								{
									System.out.println("count 2 ");
									
									
									if(counter1==0)
									{
										counter1 = counter2/2;
										counter2 -=counter1;
										System.out.println("counter  1 = 0 ");
									}else if(counter3==0)
									{
										counter3 = counter2/2;
										counter2 -=counter3;
										System.out.println("counter  3 = 0 ");
									}else if(counter4==0)
									{
										counter4 = counter2/2;
										counter2 -=counter4;
										System.out.println("counter  4 = 0 ");
									}else
									{
										System.out.println("Esle ex");
									}
									System.out.println("test Counter One Check : " + counter2 + " test   :" + counter2);
									counter2 = addCounter2(counter2,array2, j);
									System.out.println(" 2  if counter Value  : " + counter2);
									
								}
								 else if(counter1 !=0)
									{
									 	counter2 = addCounter2(counter2,array2, j);
									 	System.out.println(" 2  else counter Value  : " + counter2);
									}
								 
								 
								 if( counter3>counter1 && counter3>counter2 && counter3>counter4 && counter3%2==0 )
								{
									System.out.println("count 3");
									
									
									if(counter1==0)
									{
										counter1 = counter3/2;
										counter3 -=counter1;
									}else if(counter2==0)
									{
										counter2 = counter3/2;
										counter3 -=counter2;
									}else if(counter4==0)
									{
										counter4 = counter3/2;
										counter3 -=counter4;
									}else
									{
										System.out.println("Esle ex");
									}
									
									
									System.out.println("test Counter One Check : " + counter3+ " test   :" + counter3 );
									counter3 = addCounter3(counter3,array3, j);
									System.out.println(" 3  if counter Value  : " + counter3);
								}
								 else if(counter3 !=0)
									{
									 	counter3 = addCounter3(counter3,array3, j);
									 	System.out.println(" 3  else counter Value  : " + counter3);
									}
								 
								 
								 if( counter4>counter1 &&  counter4>counter2 && counter4>counter3 && counter4%2==0)
								{
									System.out.println("count 4");
									
									if(counter1==0)
									{
										counter1 = counter4/2;
										counter4 -=counter1;
									}else if(counter2==0)
									{
										counter2 = counter4/2;
										counter4 -=counter2;
									}else if(counter3==0)
									{
										counter3 = counter4/2;
										counter4 -=counter3;
									}else
									{
										System.out.println("Esle ex");
									}
									
									
									System.out.println("test Counter One Check : " + counter4 + " test   :" + counter4);
									counter4 = addCounter4(counter4,array4, j);
									System.out.println(" 4  if counter Value  : " + counter4);
								}else if(counter4 !=0)
								{
									counter4 = addCounter4(counter4,array4, j);
									System.out.println(" 4  else counter Value  : " + counter4);
								}
								
							
					
								
//								if ( counter1>counter2 && counter1>counter3 && counter1>counter4 && counter2%2==0 )
//								{
//									System.out.println("count 1 ");
//									counter1 = counter1 /2;
//									counter1 -=counter1;
//									System.out.println("test Counter One Check : " + counter2 + " test   :" + counter2);
//									counter2 = addCounter2(counter2,array2, j);
//									
//								}
//								else if ( counter2>counter1 && counter2>counter3 & counter2>counter4 && counter2%2==0 )
//								{
//									System.out.println("count 2 ");
//									counter1 = counter2 /2;
//									counter2 -=counter1;
//									System.out.println("test Counter One Check : " + counter1 + " test   :" + counter2);
//									counter2 = addCounter2(counter2,array2, j);
//									
//								}
//								else if( counter3>counter1 && counter3>counter2 && counter3>counter4 && counter3%2==0 )
//								{
//									System.out.println("count 3");
//									counter1 = counter3 /2;
//									counter3 -=counter1;
//									
//									System.out.println("test Counter One Check : " + counter1+ " test   :" + counter3 );
//									counter2 = addCounter2(counter2,array2, j);
//								}
//								else if( counter4>counter1 &&  counter4>counter2 && counter4>counter3 && counter4%2==0)
//								{
//									System.out.println("count 4");
//									counter1 = counter4 /2;
//									counter4 -=counter1;
//									
//									System.out.println("test Counter One Check : " + counter1 + " test   :" + counter4);
//									counter2 = addCounter2(counter2,array2, j);
//								}
//								else if(counter2 != 0)
//									{
//											counter2 = addCounter2(counter2,array2, j);
//											System.out.println(" execute counter 2 ==>> 0");
//									}
//								
//								else
//								{
//									System.out.println("last else");
//								}
//							
				
				
//							if( counter1>counter3 && counter1>counter4 && counter1%2==0)
//									{
//										System.out.println("count 1");
//										
//										counter2 = counter1 /2;
//										counter1 -=counter2;
//										
//										System.out.println("test Counter 2 Check : " + counter2+ " test   :" + counter1 );
//										counter2 = addCounter2(counter2,array2, j);
//									}
//							else if(counter3>counter1 &&  counter3>counter4 && counter3%2==0)
//							{
//								System.out.println("count 3");
//								counter2 = counter3 /2;
//								counter3 -=counter2;
//								
//								System.out.println("test Counter 2 Check : " + counter2 + " test   :" + counter3);
//								counter2 = addCounter2(counter2,array2, j);
//							}
//							else if(counter4>counter1 && counter4>counter3 && counter4%2==0)
//							{
//								System.out.println("count 4");
//								counter2 = counter4 /2;
//								counter4 -=counter2;
//								
//								System.out.println("test Counter 2 Check : " + counter2 + " test   :" + counter4);
//								counter2 = addCounter2(counter2,array2, j);
//							}
//							else if( counter2 != 0)	
//							{
//								counter2 = addCounter2(counter2,array2, j);
//								System.out.println(" execute counter 2 ==>> 0");
//							}
//					
//		
//							if (counter1>counter2 &&  counter1>counter4 && counter1%2==0)
//							{
//								System.out.println("count 2 ");
//								counter3 = counter1 /2;
//								counter1 -=counter3;
//								
//								System.out.println("test Counter 3 Check : " + counter3 );
//								counter3 = addCounter3(counter3,array3, j);
//							}
//							else if(counter2>counter1 &&  counter2>counter4 && counter2%2==0)
//							{
//								System.out.println("count 3");
//								counter3 = counter2 /2;
//								counter2 -=counter3;
//								
//								System.out.println("test Counter 3 Check : " + counter3 );
//								counter3 = addCounter3(counter3,array3, j);
//								
//							}
//							else if(counter4>counter1 && counter4>counter2 && counter4%2==0 )
//							{
//								System.out.println("count 4");
//								counter3 = counter4 /2;
//								counter4 -=counter3;
//								
//								System.out.println("test Counter 3 Check : " + counter3 );
//								counter3 = addCounter3(counter3,array3, j);
//								
//							}
//							else if(counter3 != 0)
//								{
//									counter3 = addCounter3(counter3,array3, j);
//									System.out.println(" execute counter 3 ==>> 0");
//								}
//					
//					
//					
//					
//				
//							if (counter1>counter2 && counter1>counter3 && counter1%2==0 )
//							{
//								System.out.println("count 2 ");
//								counter4 = counter1 /2;
//								counter1 -=counter4;
//								
//								System.out.println("test Counter 4 Check : " + counter4 );
//								counter4 = addCounter4(counter4,array4, j);
//							}
//							else if(counter2>counter1 && counter2>counter3 && counter2%2==0 )
//			
//							{
//								System.out.println("count 3");
//								counter4 = counter2 /2;
//								counter2 -=counter4;
//								
//								System.out.println("test Counter 4 Check : " + counter4 );
//								counter4 = addCounter4(counter4,array4, j);
//								
//							}
//							else if(counter3>counter1 && counter3>counter2 && counter3%2==0)
//							{
//								System.out.println("count 4");
//								counter4 = counter3 /2;
//								counter3 -=counter4;
//								
//								System.out.println("test Counter 4 Check : " + counter4 );
//								counter4 = addCounter4(counter4,array4, j);
//								
//							}
//							else if(counter4  != 0)
//							{
//								counter4 = addCounter4(counter4,array4, j);
//								System.out.println(" execute counter 4 ==>> 0");
//							}
				
				
					
				System.out.println("-----------------------------------------------------------------------------");
			
		}
		
		System.out.println("Counter 1 Issue Ticket : " + array1);
	
		System.out.println("Counter 2 Issue Ticket : " + array2);
	
		System.out.println("Counter 3 Issue Ticket : " + array3);
	
		System.out.println("Counter 4 Issue Ticket : " + array4);

	}
	
	
	
	
	public static int addCounter1(int counter1 ,ArrayList<Integer>array1,int j )
	{
		
		
		array1.add(j);
		System.out.println("..................==>> "
				+ "First Counter Give Ticket   : " + array1);
		counter1--;
		return counter1;
	}
	public static int addCounter2(int counter2 ,ArrayList<Integer>array2,int j )
	{
		
		array2.add(j);
		System.out.println(".................==>> "
				+ "Second Counter Give Ticket   : " + array2);
		counter2--;
		return counter2;
	}
	public static int addCounter3(int counter3 ,ArrayList<Integer>array3,int j)
	{
		
		
		array3.add(j);
		System.out.println(".................==>> "
				+ "Third Counter Give Ticket   : " + array3);
		counter3--;
		return counter3;
	}
	public static int addCounter4(int counter4 ,ArrayList<Integer>array4,int j)
	{
		
		array4.add(j);
		System.out.println("...................==>> "
				+ "Fourth Counter Give Ticket   : " + array4);
		counter4--;
		return counter4;
	}

}
