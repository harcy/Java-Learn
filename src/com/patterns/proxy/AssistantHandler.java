package com.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @author lxchen
 * 动态代理的Handler
 */
public class AssistantHandler implements InvocationHandler {
	
	private Object targetObject;
	
	/**
	 *创建代理对象，这段代码也可以不在此类，放在客户端里面 
	 */
	public Object createProxy(Object tartgetObject){
		this.targetObject=tartgetObject;
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(), this);
	};
	
	/**
	 * 必须实现，在代理实例上处理方法调用并返回结果。在与方法关联的代理实例上调用方法时，将在调用处理程序上调用此方法
	 */
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result=null;
		System.out.println("递给领导CEO");
		result=method.invoke(this.targetObject, args);
		System.out.println("装入袋子，送出");
		return result;
	}

}
