package com.simplilearn.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> queue= new LinkedList<>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		//it will just give the first element
		System.out.println("Peek: "+queue.peek());
		//it will give you the first element as well as remove from the queue
		System.out.println("Poll: "+queue.poll());
		System.out.println("Peek: "+queue.peek());
		
	}
}
