package com.learn.callback;

/**
 * @author lxchen
 * 经典的回调方式：
 * 	Class A实现接口CallBack callback ----step 1
 * 	Class A中包含Class B的一个引用b     ----step 2 
 * 	Class B有一个参数为callback的方法function(CallBack callback) ----step 3
 * 	A的对象a调用B的方法function(CallBack callback) ----A类调用了B类的某个方法func1
 * 	然后b就可以在function(CallBack callback)方法中调用A的方法  ----B类调用了A类的某个方法func2
 */
//实现了一个回调接口，step 1
public class Tina implements CallBack {
	
	private Harcy harcy;
	
	//对象的引用，step 2
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

	//当harcy知道答案后调用此方法告诉tina，这就是所谓的tina的会回调方法???
	@Override
	public void solve(String result) {
		System.out.println("harcy告诉tina答案是--->"+result);	
		
	}
	
	
	
	

}
