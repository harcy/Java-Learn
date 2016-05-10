package com.patterns.observepattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {

		//����Ŀ��
		ConcreteSubject subject=new ConcreteSubject();
		//����������(�۲���)		
		ConcreteObserver observeLakers=new ConcreteObserver();
		observeLakers.setObserverName("NBA Lakers");
		
		ConcreteObserver observerHeats=new ConcreteObserver();
		observerHeats.setObserverName("NBA Hearts");
		
		//ע�ᶩ����(�۲���)
		subject.attach(observeLakers);
		subject.attach(observerHeats);
		//������Ϣ����(�������� or �۲���)
		subject.setMessageContent("Weather is very good for playing");

	}

}
