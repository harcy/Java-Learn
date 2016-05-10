package com.learn.test;


public class TestCallback extends Thread{//implements Runnable{//

	private int value;
	
	public TestCallback(int value) {
		this.value=value;
	}

	
	@Override
	public void run() {
		System.out.println(value);		
	}


	public static void main(String[] args) {
		TestCallback cb=new TestCallback(10);
		cb.start();
		System.out.println(11);
	}

}
