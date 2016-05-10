package com.patterns.proxy;


/**
 * @author lxchen
 * ��������(Proxy subject)
 * ��������ͷ�װ��ʵ����
 */
public class Assistant implements Leader {
	
	private Leader leader;
	
	public Assistant(Leader leader) {
		super();
		this.leader=leader;
	}

	@Override
	public void sign() {
		System.out.println("�ݸ��쵼CEO");
		leader.sign();
		System.out.println("װ����ӣ��ͳ�");
	}

}
