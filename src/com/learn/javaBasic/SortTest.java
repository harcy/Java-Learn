package com.learn.javaBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortTest {
	
	public static void sortTest(){
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(4);
		System.out.println("List preSort:");
		System.out.println("\t"+list+"\n");
		Collections.sort(list);
		System.out.println("List afterSort:");
		System.out.println("\t"+list+"\n");
	}

	public static void main(String[] args) {
		sortTest();
	}

}
