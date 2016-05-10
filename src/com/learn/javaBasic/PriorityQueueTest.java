package com.learn.javaBasic;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
		int a[]={1,10,5,3,4,7,6,9,8};
		PriorityQueue<Integer> intQueue=new PriorityQueue<Integer>();
		for (Integer i : a) {
			intQueue.offer(i);		
			}
		System.out.println("intQueue: "+ intQueue);
	}

}
