package com.learn.jvm;


/**
 * package修饰符，默认的访问控制修饰符，也称为
 * default,在同一包内可见，不适用任何修饰符
 * @author lxchen
 *
 */
class Parent {
	
	static{
		System.out.println("Parent init");
	}
	
	public static int v=100;

}
