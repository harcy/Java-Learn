package com.learn.initPara;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	
	public static void printFieldMessage(Object o){
		Class c=o.getClass();
		Field[] fields=c.getDeclaredFields();
		for(Field f:fields){
			Class filedType=f.getType();
			String fieldTypeName=filedType.getName();
			String fieldName=f.getName();
			System.out.println(fieldTypeName+" "+fieldName);
		}
		
	}
	
	public static void printMethodMessage(Object o){
		Class c=o.getClass();
		Method[] methods=c.getMethods();
		for(Method ms:methods){
			Class returnType=ms.getReturnType();
			System.out.print(returnType.getName()+" ");
			System.out.print(ms.getName()+"(");
			Class[] para=ms.getParameterTypes();
			for(Class pm:para){
				System.out.print(pm.getName()+",");
			}
			System.out.println(")");
		}
	}
	
	public static void main(String[] args) throws NoSuchMethodException, Throwable {
		String s="hello";
		//ClassUtil.printFieldMessage(s);
		//ClassUtil.printMethodMessage(s);
		ReflectDemo reflect=new ReflectDemo();
		System.out.println(reflect.eyeColor());
		Class c=reflect.getClass();
		Method m1=c.getMethod("print", int.class,int.class);
		Method m2=c.getMethod("print", String.class,String.class);
		m1.invoke(reflect,10,20);
		m2.invoke(reflect,"hello","shanghai");
		Description d=(Description)c.getAnnotation(Description.class);
		System.out.println(d.author());
	}

}
