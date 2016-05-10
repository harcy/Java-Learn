package com.source.leetcode;

public class B {
	
//    static
//    {
//    	System.out.println("Loading Gum");
//    }
	/*B(String s)
	{
		System.out.println("hello B"+s);
	};*/
	public static void main(String[] args) {
		
		B b1=new B();
		B b2=new B();
		if(b1==b2)
			System.out.println("b1 and b2 point the same object use ==");
		else
			System.out.println("b1 and b2 point the different object use ==");
		if(b1.equals(b2))
			System.out.println("b1 and b2 point the same object use equals");
		else
			System.out.println("b1 and b2 point the different object use equals");

	}

}
