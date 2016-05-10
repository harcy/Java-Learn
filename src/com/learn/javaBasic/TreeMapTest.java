package com.learn.javaBasic;

import java.util.HashMap;
import java.util.Map;

import com.learn.jvm.Employee;

public class TreeMapTest {
	
	public static void objOper(){
		Map<String,Employee> employees=new HashMap<String,Employee>();
		String number="1206010035";
		employees.put(number, new Employee());
		System.out.println(employees);
		System.out.println(employees.get(number));
	}
	
	public static void nullOper(){
		Map<String,String> map=new HashMap<String,String>();
		map.put(null, "null01");
		map.put(null, "null02");
		System.out.println(map);
		System.out.println(map.get(null));
	}

	public static void main(String[] args) {
		/*//Map<String,String> map=new TreeMap<String,String>();
		Map<String,String> map=new HashMap<String,String>();
		map.put("1", "1");
		map.put("4", "4");
		map.put("2", "2");
		map.put("3", "3");
		System.out.println(map);*/
		objOper();
		nullOper();
	}

}
