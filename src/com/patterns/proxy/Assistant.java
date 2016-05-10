package com.patterns.proxy;


/**
 * @author lxchen
 * 代理主题(Proxy subject)
 * 用来代理和封装真实主题
 */
public class Assistant implements Leader {
	
	private Leader leader;
	
	public Assistant(Leader leader) {
		super();
		this.leader=leader;
	}

	@Override
	public void sign() {
		System.out.println("递给领导CEO");
		leader.sign();
		System.out.println("装入袋子，送出");
	}

}
