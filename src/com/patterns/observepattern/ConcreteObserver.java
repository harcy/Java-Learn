package com.patterns.observepattern;

public class ConcreteObserver implements Observer {


	private String observerName;
	
	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}
    
	//实现接口里的update方法
	@Override
	public void update(Subject subject) {
		
		ConcreteSubject conSubject=(ConcreteSubject)subject;
		System.out.println(observerName+"Today has a game"+conSubject.getMessageContent());

	}

}
