package com.slk.task1_1;

public class InstanceIntializerBlock {
	
	{
		System.out.println("Call instance Intilizer block");
	}
	int speed ;

	public InstanceIntializerBlock()
	{
		System.out.println("Speed " + speed);
	}
	{
		speed=100;
	}
	
	static
	{
		System.out.println("I am tarun Patel");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceIntializerBlock instanceIntializerBlock= new InstanceIntializerBlock();
	}

}
