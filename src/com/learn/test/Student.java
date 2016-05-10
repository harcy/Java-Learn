package com.learn.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Student implements Comparable<Student>{
	@Override
	public int compareTo(Student o) {
		return this.stuScore.compareTo(o.getStuScore());
	}
	
	String stuName;
	Integer stuScore;
	public Integer getStuScore() {
		return stuScore;
	}
	public void setStuScore(Integer stuScore) {
		this.stuScore = stuScore;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Student(){
		
	}
    public Student(String stuName, Integer stuScore) {
		this.stuName=stuName;
		this.stuScore=stuScore;
	}
    public void reflectSet() throws Exception, Throwable {
    	
    	Student stu=new Student();
    	Class stuClass=stu.getClass();
    	Method setMethod=stuClass.getDeclaredMethod("setStuName", String.class);
    	setMethod.invoke(stu, "Xiao Wang");
    	/*Method[] mArray=stuClass.getDeclaredMethods();
    	for(Method m:mArray){
    		String name=m.getName();
    		if(name.equals("setStuName")){
    			Class[] types=m.getParameterTypes();
    			int size=types.length;
    			m.invoke(stu, args);
    		}
    		else
    			continue;
    	}*/
    	
    	
		/*Class<Student> c=Student.class;
		System.out.println(c.getSimpleName());
		Field[] fs=c.getDeclaredFields();
		for(Field f:fs){
			System.out.print(f.getName()+" ");
			System.out.print(f.getType().getSimpleName());
			System.out.println();
		}
		Method[] ms=c.getDeclaredMethods();
		for(Method m:ms){
			System.out.println(m.getName());
			System.out.println(m.getReturnType().getSimpleName());
			Class<?>[] parameterType=m.getParameterTypes();
			for(Class<?> type:parameterType){
				System.out.println(type.getSimpleName()+" ");
			}
		}
		Constructor<?>[] cons=c.getDeclaredConstructors();
		for(Constructor<?> con:cons){
			System.out.println(con.getName());
			Class<?>[] types=con.getParameterTypes();
			for(Class<?> type:types){
				System.out.println(type.getSimpleName());
			}
		}*/
	}

	

}
