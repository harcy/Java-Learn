package com.patterns.dynamicProxy;

public class RealSubject implements Subject {

	@Override
	public void request() {
		
		System.out.println("dosomthing really by RealSubject from dynamic proxy");

	}

}
