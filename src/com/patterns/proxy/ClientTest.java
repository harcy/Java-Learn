package com.patterns.proxy;

import java.lang.reflect.Proxy;


/**
 * 不是一个非常好的例子(不用看此包下的代码)
 * @author lxchen
 * 测试类  包括静态代理和动态代理
 */
public class ClientTest {

	public static void main(String[] args) {
		
		//静态代理测试
		CEO ceo=new CEO();
		Leader leader1=new Assistant(ceo);
		leader1.sign();
		System.out.println("==================================");
		
		//动态代理，三种方式都可获得动态代理对象
		AssistantHandler ah=new AssistantHandler();
		Leader l=(Leader)Proxy.newProxyInstance(Leader.class.getClassLoader(),
				new Class[]{Leader.class}, ah);
		l.sign();

	}

}
