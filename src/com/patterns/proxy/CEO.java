package com.patterns.proxy;


/**
 * @author lxchen
 * 真实主题(Real subject) 真实主题CEO
 * 真实主题，真正实现业务逻辑的类，
 * (本例真正实现sign方法的主题，即”签文件“)
 */
public class CEO implements Leader {

	@Override
	public void sign() {
		System.out.println("CEO签文件");		
	}
	

}
