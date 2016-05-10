package com.learn.javaBasic;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<Bird> treeSet=new TreeSet<Bird>();
		treeSet.add(new Bird(1));
		treeSet.add(new Bird(3));
		treeSet.add(new Bird(2));
		Iterator<Bird> ite=treeSet.iterator();
		while(ite.hasNext()){
			Bird bird=ite.next();
			System.out.println(bird);
		}

	}

}
