package com.patterns.staticProxy;


/**
 * @author lxchen
 * ��ʵ��ɫ�� �����ɫ���������ʵ������������Ҫ���õĶ���
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("dosomething really by RealSubject");
	}

}
