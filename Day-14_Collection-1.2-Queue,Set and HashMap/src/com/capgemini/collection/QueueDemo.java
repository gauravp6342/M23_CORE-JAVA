package com.capgemini.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo 
{

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(23);
		q.add(29);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
	}

}
