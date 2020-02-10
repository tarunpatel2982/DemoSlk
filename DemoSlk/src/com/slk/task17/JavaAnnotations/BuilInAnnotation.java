package com.slk.task17.JavaAnnotations;


class A
{
	public void show()
	{
		System.out.println("This Method Class A ");
	}
	@Deprecated
	public void s()
	{
		System.out.println("Deprecatedtest  s()");
	}
}

public class BuilInAnnotation extends A {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This MEthod Override for Class A");
	}
	
	@Deprecated
	public void addValue()
	{
		System.out.println("Add Value");
	}
	
	@SuppressWarnings({"checked", "deprecation"})
	void myMethod()
	{
		A  a = new A();
		a.s();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BuilInAnnotation b= new BuilInAnnotation();
		b.show();
		b.addValue(); 
		b.myMethod();
	}

}
