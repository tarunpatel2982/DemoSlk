package com.slk.task1_1_1;

public class SmiplePattern extends DimondPattern {

	public void simplePattern()
	{
		int n =5;
		for(int i =1;i<=n;i++)
		{
			for(int j= n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	
	public void starPattern()
	{
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}
	public void numberPattern()
	{
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}

	}
	public void charPattern()
	{
		for(char i ='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}

	}
	
	public void dimondPattern()
	{
		super.dimondPattern();
	}
	
	public void smpPattern()
	{
		
		for(int i =1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmiplePattern smiplePattern= new SmiplePattern();
		smiplePattern.simplePattern();
		smiplePattern.starPattern();
		smiplePattern.numberPattern();
		smiplePattern.charPattern();
		smiplePattern.dimondPattern();
		smiplePattern.smpPattern();
		
		
	}

}
