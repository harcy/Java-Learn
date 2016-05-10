package com.patterns.observepattern;

public interface Observer {
	
	//定义订阅者(观察者)收到消息之后的更新操作接口
	public void update(Subject subject);

}
