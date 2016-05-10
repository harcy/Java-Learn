package com.patterns.observepattern;

public class ConcreteSubject extends Subject {
       
	private String messageContent;
	
	public String getMessageContent() {
		return messageContent;
	}

	//set方法中发送通知
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
		this.notifyObservers();
	}

}
