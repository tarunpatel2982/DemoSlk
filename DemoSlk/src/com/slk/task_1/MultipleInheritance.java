package com.slk.task_1;

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hockey hockeyObject = new Hockey() {
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("Start Events");
			}
			
			@Override
			public void play() {
				// TODO Auto-generated method stub

				System.out.println("play sport");
				
			}
			
			@Override
			public void show() {
				// TODO Auto-generated method stub

				System.out.println("Show hockey");
			}
		};
		
		hockeyObject.start();
		hockeyObject.play();
		hockeyObject.show();
	}

}
