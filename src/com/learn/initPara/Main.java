package com.learn.initPara;

import java.lang.reflect.Method;

/*
 * 1.����Derived���캯��
 * 2.Derived��Ա�������ڴ汻����
 * 3.Base���캯������������
 * 4.Base���캯������preProcess()
 * 5.Derived��preProcess������Ϊ��set in preProcess()��
 * 6.Deviced�ĳ�Ա������ʼ��������
 * 7.ִ��Derived���캯����
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
