package com.patterns.staticProxy;

/**
 * @author lxchen
 * ��̬�����Ծ�����ʵ����ֱ������
 * �����ɫ�������ɫ��Ҫ�ж���ʵ��ɫ������
 * ��������ʵ��ɫ����������
 */
public class ProxySubject implements Subject {
	
	private RealSubject realSubject=null;

	/**
	 * ���˴�����ʵ��ɫ�����������飬�����ɫ�������ṩ���ӵĲ�����
	 * �磺preRequest() & postRequest()������
	 */
	@Override
	public void request() {
		preRequest();//��ʵ��ɫ����ǰ�ĸ��Ӳ���
		if(realSubject==null){
			realSubject=new RealSubject();
		}
		realSubject.request();
		postRequest();//��ʵ��ɫ������ĸ��Ӳ���
	}
	
	public void preRequest(){
		System.out.println("additional operate before RealSubject operation");
	}
	
	public void postRequest(){
		System.out.println("additional operate after RealSubject operation");
	}

}
