package com.patterns.singleton;


public class SingletonDemo {
	
	public static void main(String[] args) {
		//Singleton s1=Singleton.singleInstance;
		//Singleton s2=Singleton.singleInstance;
		Integer i=new Integer(3);
		Integer j=new Integer(3);
		/*
		 * Integer��д��Object���equals����
		 * 
		 * 
		 * */
		if(i.equals(j))
			System.out.println("i=j use equals");
		if(j instanceof Integer)
			System.out.println(i.intValue() == (Integer)j.intValue());
		if(i==j)
			System.out.println("true");
		Singleton s1=Singleton.getSingleInstance();
		Singleton s2=Singleton.getSingleInstance();
		//Object���equals������==������һ���ģ��ж��������������Ƿ�ָ��ͬһ������
		//���Ƚ�����������ڴ��ַʱ����һ���ģ�Ҳ���Ƚ��ǲ���ͬһ������
		if(s1==s2)
			System.out.println("s1 & s2 are the same instance");
		if(s1.equals(s2))
			System.out.println("s1 &s2 are not the same instance");
	}

}
