package com.learn.multiThread;

public class ThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("hello thread!");
		
	}/*extends Thread {

	@Override
	public void run() {
		System.out.println("hello thread!");
	}
	
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		td.start();
	}*/
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		new Thread(td).start();
		System.out.println("hello main");
	}

}
