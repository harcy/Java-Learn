package com.patterns.singleton;

public class Singleton {
	
	private Singleton(){
		
	}
	
	//饿汉模式
	//public static Singleton singleInstance = new Singleton();
	
	//懒汉模式
	public static Singleton singleInstance;

	public static Singleton getSingleInstance() {
		if(singleInstance ==null)
			singleInstance=new Singleton();
		return singleInstance;
	}

	public static void setSingleInstance(Singleton singleInstance) {
		Singleton.singleInstance = singleInstance;
	}
	

}
