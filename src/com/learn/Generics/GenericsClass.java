package com.learn.Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenericsClass<T> {
	
	private T field;

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}
	
	public <K,V> void sayHello(Map<K,V> map){
		Set<Entry<K,V>> setEntry=map.entrySet();
		for(Entry<K,V> entry:setEntry){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}
	
	public <U> U getHello(U parameter){
		return parameter;
	}
	
	public static void main(String[] args) {
		GenericsClass<String> gc=new GenericsClass<>();
		gc.setField("American Dream!");
		System.out.println(gc.getField());
		Map<Integer,Integer> intMap=new HashMap<Integer,Integer>();
		intMap.put(Integer.valueOf(1), Integer.valueOf(119));
		intMap.put(Integer.valueOf(2), Integer.valueOf(911));
		intMap.put(Integer.valueOf(3), Integer.valueOf(999));
		intMap.put(Integer.valueOf(4), Integer.valueOf(111));
		gc.sayHello(intMap);
		Map<String,String> strMap=new HashMap<String,String>();
		strMap.put("1", "USA");
		strMap.put("2", "China");
		strMap.put("3", "Canada");
		strMap.put("4", "NewZeland");
		gc.sayHello(strMap);
		
		
	}
}
