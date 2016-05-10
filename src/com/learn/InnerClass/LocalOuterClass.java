package com.learn.InnerClass;

//局部内部类
public class LocalOuterClass {
	
	private int x=10;
	public void doSomething(){
		final String name="local variable";
		class LocalInnerClass{
			public void seeOuter(){
				System.out.println("Outer value of x is:"+x);
				System.out.println("Value of name is:"+name);
				System.out.println(LocalOuterClass.this);
				System.out.println(this);
			}
		}
		LocalInnerClass inner=new LocalInnerClass();
		inner.seeOuter();
	}
	
	public static void main(String[] args) {
		LocalOuterClass outer=new LocalOuterClass();
		outer.doSomething();
	}

}
