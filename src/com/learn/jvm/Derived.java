package com.learn.jvm;

public class Derived extends Base {
	
	//public String whenAmISet="set when declared child";
	public Derived(){
		//whenAmISet="set in constructor";
		System.out.println("child constructor");
	}
	
	void preProcess(){
		whenAmISet="set in preProcess()";
		System.out.println("hello child class");
	}

}
