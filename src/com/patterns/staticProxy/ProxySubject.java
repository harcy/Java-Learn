package com.patterns.staticProxy;

/**
 * @author lxchen
 * 静态代理，对具体真实对象直接引用
 * 代理角色：代理角色需要有对真实角色的引用
 * 代理做真实角色想做的事情
 */
public class ProxySubject implements Subject {
	
	private RealSubject realSubject=null;

	/**
	 * 除了代理真实角色做该做的事情，代理角色还可以提供附加的操作，
	 * 如：preRequest() & postRequest()方法等
	 */
	@Override
	public void request() {
		preRequest();//真实角色操作前的附加操作
		if(realSubject==null){
			realSubject=new RealSubject();
		}
		realSubject.request();
		postRequest();//真实角色操作后的附加操作
	}
	
	public void preRequest(){
		System.out.println("additional operate before RealSubject operation");
	}
	
	public void postRequest(){
		System.out.println("additional operate after RealSubject operation");
	}

}
