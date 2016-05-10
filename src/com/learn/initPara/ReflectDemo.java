package com.learn.initPara;

public class ReflectDemo {
	
	@Description(desc="i am eyeColor",author="Mooc girl")
	public String eyeColor(){
		return "red";
	}
	
	public static void print(int a,int b){
		System.out.println(a+b);
	}
	
	public static void print(String a,String b){
		System.out.println(a.toUpperCase()+b.toUpperCase());
	}

}
