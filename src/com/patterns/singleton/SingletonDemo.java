package com.patterns.singleton;


public class SingletonDemo {
	
	public static void main(String[] args) {
		//Singleton s1=Singleton.singleInstance;
		//Singleton s2=Singleton.singleInstance;
		Integer i=new Integer(3);
		Integer j=new Integer(3);
		/*
		 * Integer重写了Object类的equals方法
		 * 
		 * 
		 * */
		if(i.equals(j))
			System.out.println("i=j use equals");
		if(j instanceof Integer)
			System.out.println(i.intValue() == (Integer)j.intValue());
		if(i==j)
			System.out.println("true");
		Singleton s1=Singleton.getSingleInstance();
		Singleton s2=Singleton.getSingleInstance();
		//Object类的equals方法和==功能是一样的，判断两个对象引用是否指向同一个对象
		//即比较两个对象的内存地址时候是一样的，也即比较是不是同一个对象
		if(s1==s2)
			System.out.println("s1 & s2 are the same instance");
		if(s1.equals(s2))
			System.out.println("s1 &s2 are not the same instance");
	}

}
