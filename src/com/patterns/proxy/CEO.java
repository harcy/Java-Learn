package com.patterns.proxy;


/**
 * @author lxchen
 * ��ʵ����(Real subject) ��ʵ����CEO
 * ��ʵ���⣬����ʵ��ҵ���߼����࣬
 * (��������ʵ��sign���������⣬����ǩ�ļ���)
 */
public class CEO implements Leader {

	@Override
	public void sign() {
		System.out.println("CEOǩ�ļ�");		
	}
	

}
