package com.patterns.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxySubject implements InvocationHandler {
	
	private Object targetSubject; //真实对象的引用
	
	public DynamicProxySubject(Object targetSubject) {
		this.targetSubject=targetSubject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before calling "+method);
		method.invoke(targetSubject, args);
		System.out.println("after calling "+method);
		return null;
	}

}
