package com.patterns.observepattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
      
	//����������(�۲���)�б�	
	private List<Observer> observers=new ArrayList<Observer>();
	
	//ע�ᶩ����(�۲���)
	public void attach(Observer observer){
		observers.add(observer);
	}
	//ɾ��������(�۲���)
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	//������Ϣ֪ͨ������(�۲���) 
	//update ����Ϊ����-----------------��ģʽ
	//       ����Ϊ�����field-----------��ģʽ
	public void notifyObservers(){
		for(Observer b:observers)
			b.update(this);
	}
	  
}
