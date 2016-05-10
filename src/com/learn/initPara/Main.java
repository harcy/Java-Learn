package com.learn.initPara;

import java.lang.reflect.Method;

/*
 * 1.进入Derived构造函数
 * 2.Derived成员变量的内存被分配
 * 3.Base构造函数被隐含调用
 * 4.Base构造函数调用preProcess()
 * 5.Derived的preProcess被设置为“set in preProcess()”
 * 6.Deviced的成员变量初始化被调用
 * 7.执行Derived构造函数体
 * */

public class Main {

//	public static void main(String[] args) {
//		Derived d=new Derived();
//		System.out.println(d.initParameter);
	@Description(desc="i am eyeColor",author="Mooc girl")
	public String eyeColor(){
		return "red";
	}
	
	public static void main(String[] args) {
		Main m=new Main();
		Class c=m.getClass();
		try {
			Method method=c.getMethod("eyeColor");
			Description d=(Description)method.getAnnotation(Description.class);
			System.out.println(d.desc()+" "+d.author());
			System.out.println(d.age());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
		

	//}

}
