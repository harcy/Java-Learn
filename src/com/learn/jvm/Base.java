package com.learn.jvm;

class Base {
	
	public String whenAmISet="set when declared parent";
	
	Base(){
		//preProcess();
		System.out.println("parent constructor");
	}
	void preProcess(){
		System.out.println("hello parent class");
	}

}
