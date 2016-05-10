package com.learn.javaBasic;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListPKLinkedList {
	
	public static void test(){
		ArrayList<Integer> 	arrayList  = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
				
		// ArrayList add方法
		long startTime = System.nanoTime();
		long endTime;
		long duration; 
		for (int i = 0; i < 100000; i++)
			arrayList.add(i);
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList add:  " + duration);
		 
		// LinkedList add方法
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++)
			linkedList.add(i);
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList add: " + duration);
		 
		// ArrayList get方法
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++)
			arrayList.get(i);
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList get:  " + duration);
		 
		// LinkedList get方法
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++)
			linkedList.get(i);
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList get: " + duration);
		 
		// ArrayList remove方法
		startTime = System.nanoTime();
		for (int i = 9999; i >=0; i--)
			arrayList.remove(i);
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList remove:  " + duration);
		 
		// LinkedList remove方法
		startTime = System.nanoTime();
		for (int i = 9999; i >=0; i--)
			linkedList.remove(i);
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList remove: " + duration);
	}

	public static void main(String[] args) {
		
		test();

	}

}
