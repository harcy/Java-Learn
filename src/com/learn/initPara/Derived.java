package com.learn.initPara;

public class Derived extends Base {
	public String initParameter="set when declared";
	
	@Override void preProcess(){
		initParameter="set in preProcess()";
		System.out.println("Derived preProcess Function");
	}
	

}
