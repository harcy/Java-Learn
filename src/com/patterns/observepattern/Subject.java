package com.patterns.observepattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
      
	//创建订阅者(观察者)列表	
	private List<Observer> observers=new ArrayList<Observer>();
	
	//注册订阅者(观察者)
	public void attach(Observer observer){
		observers.add(observer);
	}
	//删除订阅者(观察者)
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	//发送消息通知订阅者(观察者) 
	//update 参数为对象-----------------拉模式
	//       参数为对象的field-----------推模式
	public void notifyObservers(){
		for(Observer b:observers)
			b.update(this);
	}
	  
}
