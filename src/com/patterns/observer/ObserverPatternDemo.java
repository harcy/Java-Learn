package com.patterns.observer;


/*
 *观察者模式使用三个类 Subject、Observer 和 Client。Subject 对象带有绑定观察者到 Client 对象和从 Client 对象解绑观察者的方法。
 *我们创建 Subject 类、Observer 抽象类和扩展了抽象类 Observer 的实体类。
 *ObserverPatternDemo，我们的演示类使用 Subject 和实体类对象来演示观察者模式。
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
