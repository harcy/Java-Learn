package com.patterns.observepattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {

		//创建目标
		ConcreteSubject subject=new ConcreteSubject();
		//创建订阅者(观察者)		
		ConcreteObserver observeLakers=new ConcreteObserver();
		observeLakers.setObserverName("NBA Lakers");
		
		ConcreteObserver observerHeats=new ConcreteObserver();
		observerHeats.setObserverName("NBA Hearts");
		
		//注册订阅者(观察者)
		subject.attach(observeLakers);
		subject.attach(observerHeats);
		//发布消息内容(给订阅者 or 观察者)
		subject.setMessageContent("Weather is very good for playing");

	}

}
