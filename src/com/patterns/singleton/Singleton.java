package com.patterns.singleton;

public class Singleton {
	
	private Singleton(){
		
	}
	
	//����ģʽ
	//public static Singleton singleInstance = new Singleton();
	
	//����ģʽ
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
