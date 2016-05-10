package com.learn.javaBasic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest {
	
	public static Set<String> copy(Set<String> set){
		//Set<String> setCopy=new LinkedHashSet<>(set);
		Set<String> setCopy=new HashSet<>(set);
		return setCopy;
	}

	public static int getUnion(Set<?> s1,Set<?> s2){
		int count=s1.size();
		for (Object object : s2) {
			if(!s1.contains(object))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		/*HashSet<Object> objs=new HashSet<Object>();
		objs.add(new A());
		objs.add(new B());
		objs.add(new C());
		objs.add(new A());
		objs.add(new B());
		objs.add(new C());
		System.out.println("HashSet Elements:");
		System.out.print("\t" + objs + "\n");
		System.out.println(objs.size());*/
		/*Set<String> set=new HashSet<String>();
		set.add("List");
		set.add(new String("List"));
		set.add("List");
		set.add("Set");
		set.add("Queue");
		set.add("Map");
		System.out.println("Hashset Elements:");
		System.out.println("\t"+set+"\n");*/
		/*Set<String> set=new HashSet<String>();
		set.add("List");
		set.add("Queue");
		set.add("Set");
		set.add("Map");
		System.out.println("HashSet Elements:");
		System.out.println("\t" + set + "\n");
		Set<String> set2=copy(set);
		System.out.println("HashSet Elements After Copy:");
		System.out.print("\t" + set2 + "\n");*/
		HashSet<Integer> s1=new HashSet<Integer>(Arrays.asList(1,2,3));
		HashSet<Integer> s2=new HashSet<Integer>(Arrays.asList(4,2,5));
		System.out.println(getUnion(s1,s2));
	}

}
