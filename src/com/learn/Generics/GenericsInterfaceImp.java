package com.learn.Generics;

import java.util.ArrayList;
import java.util.List;


public class GenericsInterfaceImp<T> implements GenericsInterface<T> {
	
    private List<T> list;  
    
    public GenericsInterfaceImp(){
    	
    }
    
	public GenericsInterfaceImp(List<T> list) {
		//super();
		this.list = list;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	@Override
	public T boolSelect(boolean value,T arg1,T arg2){
		if(value){
			return arg1;
		}
		else
			return arg2;
	}

	@Override
	public void add(T element) {
		//System.out.println(element.toString());
		list.add(element);
	}

	@Override
	public T next() {
		int size=list.size();
		return list.get(size-1);
	}
	
	public static void main(String[] args) {
		List<String> strList=new ArrayList<String>();
		GenericsInterface<String> gi=new GenericsInterfaceImp<String>(strList);
		gi.add("hi");
		gi.add("shanghai!");
		for(String s:strList){
			System.out.println(s);
		}
		System.out.println(gi.next());
		System.out.println(gi.boolSelect(true, "USA", "China"));
		
		List<Integer> intList=new ArrayList<Integer>();
		GenericsInterface<Integer> gi2=new GenericsInterfaceImp<Integer>(intList);
		gi2.add(Integer.valueOf(1));
		gi2.add(Integer.valueOf(9));
		for(Integer i:intList){
			System.out.println(String.valueOf(i));
		}
		System.out.println(String.valueOf(gi2.next()));
		System.out.println(gi2.boolSelect(false, Integer.valueOf(11), Integer.valueOf(99)));
	}

}
