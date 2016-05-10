package com.source.leetcode;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassLoadTest {
	
	public static void main(String[] args) {
		/*System.out.println("ClassLoadTest.getClass().getClassLoader(): "
				+ClassLoadTest.class.getClassLoader().getParent());*/
		/*try {
			//System.out.println(ClassLoadTest.class.getClassLoader());
			Class c=Class.forName("com.source.leetcode.ClassLoadTest",true,ClassLoadTest.class.getClassLoader().getParent());
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			Logger.getLogger(ClassLoadTest.class.getName()).log(Level.SEVERE,null,e);
		}*/
		
		/*URL[] urls=sun.misc.Launcher.getBootstrapClassPath().getURLs();
		for(int i=0;i<urls.length;i++)
			System.out.println(urls[i].toExternalForm());
		System.out.println(System.getProperty("sun.boot.class.path"));*/
		ClassLoader loader=Thread.currentThread().getContextClassLoader();
		System.out.println(loader);
		System.out.println(loader.getParent());
		System.out.println(loader.getParent().getParent());
	}

}
