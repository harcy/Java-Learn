package com.patterns.dynamicProxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author lxchen
 * ��ʵ����(RealSubject)����������ʱ��̬�ı䣬��Ҫ���ƵĽӿ�(Subject�ӿ�)Ҳ����
 * ������ʱ�ı䣬���Ʒ���(DynamicProxySubject��)Ҳ���Զ�̬�ı䣬�Ӷ�ʵ��
 * �ǳ����Ķ�̬�����ϵ
 */
public class DynamicProxyTest {
	
	public static void main(String[] args) throws Throwable {
		
		RealSubject realSubject=new RealSubject();
		InvocationHandler handler=new DynamicProxySubject(realSubject);
		Class RealSubjectClass=realSubject.getClass();
		
		//ʵ�ַ�ʽһ���ֽⲽ��һ����ʵ��
		Class c=Proxy.getProxyClass(RealSubjectClass.getClassLoader(),RealSubjectClass.getInterfaces());
		Constructor constructor=c.getConstructor(new Class[]{InvocationHandler.class});
		Subject subject=(Subject)constructor.newInstance(new Object[]{handler});
		subject.request();
		
		
		//ʵ�ַ�ʽ����һ�������ɽ��
		Subject subjectNew=(Subject)Proxy.newProxyInstance(RealSubjectClass.getClassLoader(), 
				RealSubjectClass.getInterfaces(), handler);
		subjectNew.request();
		
	}	
}