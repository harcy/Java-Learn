package com.patterns.observer;


/*
 *�۲���ģʽʹ�������� Subject��Observer �� Client��Subject ������а󶨹۲��ߵ� Client ����ʹ� Client ������۲��ߵķ�����
 *���Ǵ��� Subject �ࡢObserver ���������չ�˳����� Observer ��ʵ���ࡣ
 *ObserverPatternDemo�����ǵ���ʾ��ʹ�� Subject ��ʵ�����������ʾ�۲���ģʽ��
 *
 * */

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject=new Subject();
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		System.out.println("First state change:15");
		subject.setState(15);
		System.out.println("Second state change:10");
		subject.setState(10);

	}

}
