package com.learn.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainTest {

	public static void main(String[] args) throws IOException{
		//String to other type
		/*String s="123";
		Integer integer=new Integer(s);
		int i=integer.intValue();//type.xxValue() method;
		System.out.println(i);
		
		int j=Integer.parseInt(s);
		System.out.println(j);
		
		//other type to String
		int value=123;
		Integer integer2=new Integer(value);
		String convert=integer2.toString();
		System.out.println(convert);
		
		String convert2=String.valueOf(value);
		System.out.println(convert2);*/
		ServiceInterface service=new ServiceInterfaceImp();
		Class c1=ServiceInterfaceImp.class;
		service.save("shang hai");
		}
		
}
