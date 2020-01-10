package com.slk.task_1;

public class MultiLevelInheritance  extends ClassB{

	public void dispC()
    {
        System.out.println("disp() method of ClassC");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritance multiLevelInheritance = new MultiLevelInheritance();
		//multiLevelInheritance.dispA();
		multiLevelInheritance.dispB();

		multiLevelInheritance.dispC();


	}

}
