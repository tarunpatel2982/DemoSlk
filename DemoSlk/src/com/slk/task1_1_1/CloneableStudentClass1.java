package com.slk.task1_1_1;

public class CloneableStudentClass1 implements Cloneable {
	
	int studRollNo;
	String studName;

	public CloneableStudentClass1(int studRollNo , String studName)
	{
		this.studRollNo = studRollNo;
		this.studName = studName;
		
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			CloneableStudentClass1 cloneableStudentClass1 = new CloneableStudentClass1(10 ,"tarun");
			
			CloneableStudentClass1 cloneableStudentClass2 =  (CloneableStudentClass1)cloneableStudentClass1.clone();
			
			
			System.out.println(cloneableStudentClass1.studRollNo + " " + cloneableStudentClass1.studName);

			System.out.println(cloneableStudentClass2.studRollNo + " " + cloneableStudentClass2.studName);
			
		}catch(CloneNotSupportedException c) {
			
			// TODO: handle exception
		}

	}

}
