package com.learn.callback;

public class Harcy {
	
	//相当于B类有参数为CallBack callback的func方法  ---step 3
	public void thinkIt(CallBack callback,String question){
		System.out.println("tina的问题是--->"+question);
		//模拟Harcy去干别的事情需要的蛮长时间
		for(int i=0;i<10000;i++){
			
		}
		
		//Harcy干完了自己的事情，并想到了答案是2
		String result ="答案等于2";
		
		//于是打电话告诉Tina，调用Tina中的方法，这就相当于B类反过来调用A的方法
		callback.solve(result);
	}

}
