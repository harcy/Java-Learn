package com.learn.initPara;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@Table("user")
public class User {
	@Column("userName")
	private String userName;
    
	@Column("age")
	private int age;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
//	public static void main(String[] args) {
//		User u=new User();
//		//Class cu=User.class;
//		//Object o=new User();
//		u.setUserName("Google");
//		//System.out.println(u.getUserName());
//		Class c=u.getClass();
//		System.out.println(c.getClassLoader());
//		Field[] array=c.getDeclaredFields();
//		Method[] marray=c.getDeclaredMethods();
//		for(Method method:marray){
//			System.out.println(method.getName());
//			System.out.println(method.getReturnType());
//		}
//		for(Field field:array){
//			UserPara para=field.getAnnotation(UserPara.class);
//			String parameter=para.value();
//			System.out.println(parameter);
//			String fieldName=field.getName();
//			System.out.println(fieldName);
//		}
//	}

}
