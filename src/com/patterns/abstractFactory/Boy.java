package com.patterns.abstractFactory;

public class Boy implements Human {

	@Override
	public void Talk() {
		System.out.println("Boy are Talking...");
	}

	@Override
	public void Walk() {
		System.out.println("Boy are Walking...");
	}

}
