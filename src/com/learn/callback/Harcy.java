package com.learn.callback;

public class Harcy {
	
	//�൱��B���в���ΪCallBack callback��func����  ---step 3
	public void thinkIt(CallBack callback,String question){
		System.out.println("tina��������--->"+question);
		//ģ��Harcyȥ�ɱ��������Ҫ������ʱ��
		for(int i=0;i<10000;i++){
			
		}
		
		//Harcy�������Լ������飬���뵽�˴���2
		String result ="�𰸵���2";
		
		//���Ǵ�绰����Tina������Tina�еķ���������൱��B�෴��������A�ķ���
		callback.solve(result);
	}

}
