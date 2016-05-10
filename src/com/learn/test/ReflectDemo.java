package com.learn.test;


public class ReflectDemo {

	public static void main(String[] args) throws Exception, Throwable {
		Student stu=new Student();
		stu.setStuName("Xiao Ming");
		System.out.println(stu.getStuName());
		stu.reflectSet();
		System.out.println(stu.getStuName());
	}

}
