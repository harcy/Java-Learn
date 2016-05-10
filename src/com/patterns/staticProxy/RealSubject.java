package com.patterns.staticProxy;


/**
 * @author lxchen
 * 真实角色： 代理角色所代表的真实对象，是最终需要引用的对象
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("dosomething really by RealSubject");
	}

}
