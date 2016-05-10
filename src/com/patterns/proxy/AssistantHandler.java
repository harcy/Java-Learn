package com.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @author lxchen
 * ��̬�����Handler
 */
public class AssistantHandler implements InvocationHandler {
	
	private Object targetObject;
	
	/**
	 *�������������δ���Ҳ���Բ��ڴ��࣬���ڿͻ������� 
	 */
	public Object createProxy(Object tartgetObject){
		this.targetObject=tartgetObject;
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(), this);
	};
	
	/**
	 * ����ʵ�֣��ڴ���ʵ���ϴ��������ò����ؽ�������뷽�������Ĵ���ʵ���ϵ��÷���ʱ�����ڵ��ô�������ϵ��ô˷���
	 */
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result=null;
		System.out.println("�ݸ��쵼CEO");
		result=method.invoke(this.targetObject, args);
		System.out.println("װ����ӣ��ͳ�");
		return result;
	}

}
