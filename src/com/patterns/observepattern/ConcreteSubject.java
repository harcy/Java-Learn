package com.patterns.observepattern;

public class ConcreteSubject extends Subject {
       
	private String messageContent;
	
	public String getMessageContent() {
		return messageContent;
	}

	//set�����з���֪ͨ
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
		this.notifyObservers();
	}

}
