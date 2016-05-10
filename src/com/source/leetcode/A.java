package com.source.leetcode;

import java.util.*;


public class A {
	
    /*public A()
    {
    	System.out.println("hello A");
    }
	public A(String s) {
		// TODO Auto-generated constructor stub
		System.out.println("hello A"+s);
	}
	static
	{
		System.out.println("Loading Candy");
	}*/
	
	/*public String objTostr()
	{
		return this.toString();
	}
	
	public <E> void printArray(E[] element)
	{
		for(E e:element)
			System.out.println(e);
	}*/
	
	int i;
	A(int ii){
		i=ii;
	}
	static void f(A handle){
		handle.i++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A instance=new A();
		Integer[] intarray={1,2,3,4,5};
		String[] strarray={"hello","world"};
		instance.printArray(intarray);
		instance.printArray(strarray);*/
		A instance=new A(7);
		System.out.println("instance:"+instance.i);
		System.out.println("Calling f(x)");
		f(instance);
		System.out.println("instance:"+instance.i);
		String[] a={"hello","shanghai","beijing","Los Angels"};
		List<String> l=Arrays.asList(a);
		System.out.println(l.size());
		l.add("Mimia");
		System.out.println(l.size());
	}
}
