package com.patterns.dynamicProxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author lxchen
 * 真实对象(RealSubject)可以在运行时动态改变，需要控制的接口(Subject接口)也可以
 * 在运行时改变，控制方法(DynamicProxySubject类)也可以动态改变，从而实现
 * 非常灵活的动态代理关系
 */
public class DynamicProxyTest {
	
	public static void main(String[] args) throws Throwable {
		
		RealSubject realSubject=new RealSubject();
		InvocationHandler handler=new DynamicProxySubject(realSubject);
		Class RealSubjectClass=realSubject.getClass();
		
		//实现方式一：分解步骤一步步实现
		Class c=Proxy.getProxyClass(RealSubjectClass.getClassLoader(),RealSubjectClass.getInterfaces());
		Constructor constructor=c.getConstructor(new Class[]{InvocationHandler.class});
		Subject subject=(Subject)constructor.newInstance(new Object[]{handler});
		subject.request();
		
		
		//实现方式二：一次性生成结果
		Subject subjectNew=(Subject)Proxy.newProxyInstance(RealSubjectClass.getClassLoader(), 
				RealSubjectClass.getInterfaces(), handler);
		subjectNew.request();
		
	}	
}