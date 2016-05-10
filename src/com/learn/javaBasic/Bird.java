package com.learn.javaBasic;

public class Bird implements Comparable<Bird> {
	
	private int size;
	public Bird(int size) {
		this.size=size;
	}
	
	public String toString(){
		return size+"size Bird";
	}

	@Override
	public int compareTo(Bird o) {
		return this.size-o.size;
	}

}
