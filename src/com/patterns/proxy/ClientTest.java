package com.patterns.proxy;

import java.lang.reflect.Proxy;


/**
 * ����һ���ǳ��õ�����(���ÿ��˰��µĴ���)
 * @author lxchen
 * ������  ������̬����Ͷ�̬����
 */
public class ClientTest {

	public static void main(String[] args) {
		
		//��̬�������
		CEO ceo=new CEO();
		Leader leader1=new Assistant(ceo);
		leader1.sign();
		System.out.println("==================================");
		
		//��̬�������ַ�ʽ���ɻ�ö�̬�������
		AssistantHandler ah=new AssistantHandler();
		Leader l=(Leader)Proxy.newProxyInstance(Leader.class.getClassLoader(),
				new Class[]{Leader.class}, ah);
		l.sign();

	}

}
