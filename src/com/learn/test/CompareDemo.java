package com.learn.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * �Ƚϻ�������,String���͵����ݴ�Сʱ������ֱ�ӵ���Collections.sort(list)��
 * ��Ϊ��Щ����ʵ����Comparable<T>�ӿڣ�����Լ�д��������Ҫʵ�ֱȽϣ���2��ʵ�ַ���
 * <p>No1.��Ҫʵ��Comparable<T>�ӿ�,��д�ӿ��е�compareTo����
 * <p>No2.�Լ�����һ���Ƚ�����ʵ��Comparator<T>�ӿڣ�Ȼ����Collections.sort()
 *     �����д�����Ƚϵ�list�Լ��Զ���ıȽ���name
 * 
 * @author lxchen
 */
public class CompareDemo {

	//private Student stu;
	
	public static void main(String[] args) {
		
		 /*String[] str={"shanghai","beijing","anhui","guangzhou"};
		 List<String> strList=new ArrayList<String>();
		 for(String name:str){
			 strList.add(name);
		 }
		 System.out.println(strList.contains("beijing"));
		 Student[] s={new Student("xiaoW",70),new Student("xiaoM",93),new Student("xiaoH",88)};
         List<Student> stuList=new ArrayList<Student>();
         for(Student student:s)
        	 stuList.add(student);
         Student stu=new Student("xiaoM",70);
         System.out.println(stuList.contains(stu));*/
         Student s1=new Student("xiaoxiao",60);
         Student s2=s1;
         System.out.println(s1.equals(s2));
		 /*Collections.sort(strList);
		 System.out.println(strList);
         Student[] s={new Student("a",70),new Student("b",93),new Student("c",88)};
         List<Student> stuList=new ArrayList<Student>();
         for(Student student:s)
        	 stuList.add(student);
         for(int i=0;i<stuList.size();i++)
        	 System.out.println(stuList.get(i).getStuScore());
         Collections.sort(stuList);
         for(int i=0;i<stuList.size();i++)
        	 System.out.println(stuList.get(i).getStuScore());
         Course[] c={new Course("1","data struct"),new Course
        		 ("5","program language"),new Course("3","web server")};
         List<Course> courseList=new ArrayList<Course>();
         for(Course course:c)
        	 courseList.add(course);
         MyDefineComparator compareDemo=new MyDefineComparator();
         Collections.sort(courseList,compareDemo);
         for(int i=0;i<courseList.size();i++)
        	 System.out.println(courseList.get(i).getCourseNo());*/
	}

}
