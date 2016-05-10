package com.learn.callback;

/**
 * @author lxchen
 * ����Ļص���ʽ��
 * 	Class Aʵ�ֽӿ�CallBack callback ----step 1
 * 	Class A�а���Class B��һ������b     ----step 2 
 * 	Class B��һ������Ϊcallback�ķ���function(CallBack callback) ----step 3
 * 	A�Ķ���a����B�ķ���function(CallBack callback) ----A�������B���ĳ������func1
 * 	Ȼ��b�Ϳ�����function(CallBack callback)�����е���A�ķ���  ----B�������A���ĳ������func2
 */
//ʵ����һ���ص��ӿڣ�step 1
public class Tina implements CallBack {
	
	private Harcy harcy;
	
	//��������ã�step 2
	public Tina(Harcy harcy){
		this.harcy=harcy;
		//System.out.println(Harcy.this);
	}
	
	public void ask(final String question){
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				harcy.thinkIt(Tina.this,question);
				//System.out.println(Tina.this);
				//System.out.println(this);
			}
		}).start();
		playOtherThings();
	}
	
	public void playOtherThings(){
		System.out.println("I will play basketball!");
	}

	//��harcy֪���𰸺���ô˷�������tina���������ν��tina�Ļ�ص�����???
	@Override
	public void solve(String result) {
		System.out.println("harcy����tina����--->"+result);	
		
	}
	
	
	
	

}
