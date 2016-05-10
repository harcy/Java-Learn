package com.patterns.abstractFactory;

public class Girl implements Human {

	@Override
	public void Talk() {
		System.out.println("Girl are Talking...");
	}

	@Override
	public void Walk() {
		System.out.println("Girl are Walking...");
	}

}
