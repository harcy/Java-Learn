package com.learn.jvm;

import java.util.ArrayList;
import java.util.List;

public class TestValue {
		
	/*static void foo(StringBuilder builder) {
	    builder=new StringBuilder("ipad");
	}
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("iphone");
		System.out.println(sb);
		foo(sb);
		System.out.println(sb);
	}*/
	
	public static void main(String[] args) {
		/*Map<String,String> map=new HashMap<String,String>();
		map.put("1", "1");
		map.put("4", "4");
		map.put("3", "3");
		map.put("2", "2");
		System.out.println(map);*/
		
		/*Set<String> set=new HashSet<String>();
		set.add("1");
		set.add("4");
		set.add("3");
		set.add("2");
		System.out.println(set);*/
		
		List<String> h1 = new ArrayList<String>();
		h1.add("List");
		h1.add("Set");
		h1.add("Queue");
		h1.add("Map");
		System.out.println("ArrayList Elements:");
		System.out.print("\t" + h1 + "\n");
	}

}
