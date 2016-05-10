package com.learn.jvm;

public class TestInitialization {

	public static void main(String[] args) {
		
		Derived d=new Derived();
		//d.preProcess();
		System.out.println(d.whenAmISet);

	}

}
