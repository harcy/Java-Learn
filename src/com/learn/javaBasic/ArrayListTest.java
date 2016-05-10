package com.learn.javaBasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	
	public static void ListMethods(){
		List<String> list=new ArrayList<String>();
		list.add("List01");
		list.add("List03");
		list.add("List04");
		System.out.println("原来集合：\t\n"+list+"\n");
		list.add(1, "List02");
		System.out.println("指定角标1插入：\t\n"+list+"\n");
		list.remove(2);
		System.out.println("指定角标2删除：\n\t"+list+"\n");
		System.out.println("指定角标2查询：\n\t"+list.get(2)+"\n");
		Iterator<String> ite=list.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next()+"\t");
		}
	}

	public static void main(String[] args) {
		ListMethods();
	}

}
