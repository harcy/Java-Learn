package com.learn.test;

public class Course {
	
	String courseNo;
	String courseName;
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public Course(String courseNo,String courseName){
		this.courseNo=courseNo;
		this.courseName=courseName;
	}
	
	public <T> Course(T arg1,T arg2){
		System.out.println("Generics function");
	}
	
	public <T> T avgAction(boolean flag,T arg1,T arg2){
		if(flag)
			return arg1;
		else
			return arg2;
	}

}
