package com.slk.task15;

import java.util.ArrayList;
import java.util.List;

public class WildcardGenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Rectangle> rectangles = new ArrayList<Rectangle>();
		rectangles.add(new Rectangle());
		
		
		Generictest.drawShape(rectangles);
		
		
		List<Circle> circles = new ArrayList<Circle>();
		circles.add(new Circle());
		circles.add(new Circle());
		
		
		
		Generictest.drawShape(circles);
		
	}

}

abstract  class Shape
{
	abstract void draw();
}

class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  

}  
class Circle extends Shape{  
void draw(){System.out.println("drawing circle");}  
}  

class Generictest
{
	///he ? (question mark) symbol represents the wildcard element.
	public static void drawShape(List<? extends Shape> lists)
	{
		for (Shape shape : lists) {
			shape.draw();
		}
	}
}