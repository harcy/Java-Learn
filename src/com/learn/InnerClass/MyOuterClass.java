package com.learn.InnerClass;


//成员内部类(inner class)
public class MyOuterClass {
	
	private int value=10;
	
	//inner class definition
	public class MyInnerClass{
		public void seeOuter(){
			System.out.println("value is:"+value);
		}
	}
	
	/*public void innerInstance(){
		MyInnerClass inner=new MyInnerClass();
		inner.seeOuter();
	}*/
	
	public static void main(String[] args) {
		/*MyOuterClass outer=new MyOuterClass();
		outer.innerInstance();*/
		MyOuterClass.MyInnerClass inner=new MyOuterClass().new MyInnerClass();
		inner.seeOuter();
	}

}
