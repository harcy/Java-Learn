package com.learn.javaBasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterAndListIterTest {
	
	public static void iterator1(){
		List<String> a1 = new ArrayList<String>();
		a1.add("List01");
		a1.add("List02");
		a1.add("List04");
		a1.add("List05");
		Iterator<String> ite=a1.iterator();
		while(ite.hasNext()){
			Object o=ite.next();
			if(o.equals("List02"))
				ite.remove();
				//a1.add("List03");
			/*if(ite.next().equals("List02")){
				ite.remove();
 			}*/
		}
		System.out.print("Collections1:\n\t"+a1+"\n");
	}
	
	public static void iterator2(){
		List<String> a2 = new ArrayList<String>();
		a2.add("List01");
		a2.add("List");
		a2.add("List03");
		a2.add("List04");
		ListIterator<String> ite=a2.listIterator();
		while(ite.hasNext()){
			Object o=ite.next();
			if(o.equals("List")){
				ite.remove();
				ite.add("List02");
			}
		}
		System.out.print("Collections2:\n\t"+a2+"\n");
	}

	public static void main(String[] args) {
		iterator1();
		iterator2();
	}

}
