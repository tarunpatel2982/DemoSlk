package com.slk.task5;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer>  priorityQueue = new PriorityQueue<Integer>();
		priorityQueue.add(750) ;
		priorityQueue.add(500) ;
		priorityQueue.add(900) ;
		priorityQueue.add(100) ;
		
		
		System.out.println("Head : " + priorityQueue.element());
		
		
		System.out.println("Head : " + priorityQueue.peek());
		
		
		System.out.println( priorityQueue);
		System.out.println("Iterating the Queue Elements :");
		
		Iterator iterator = priorityQueue.iterator();
		
		while (iterator.hasNext()) {
			System.out.println( iterator.next());
			
		}
		
		priorityQueue.remove();
		priorityQueue.poll();
		System.out.println( " remove ===>>>>> ");
	Iterator iterator2 = priorityQueue.iterator();
		
		while (iterator2.hasNext()) {
			System.out.println( iterator2.next());
			
		}
		
		
//		while(!priorityQueue.isEmpty())
//		{
//			System.out.println(priorityQueue.remove());
//		}
//		System.out.println(priorityQueue);
	}

}
