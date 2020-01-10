package com.slk.task1_1;

public class AbstarctClassMethod extends AbstractClassMethodParent{
	int b;
	public void getb(int x , int  y)
	{
		a=x;
		b=y;
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("A = " + a);

		System.out.println("B = " + b);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstarctClassMethod abstarctClassMethod = new AbstarctClassMethod();
		abstarctClassMethod.getb(10, 20);
		abstarctClassMethod.show();
	}
}
