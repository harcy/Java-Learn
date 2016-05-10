package com.learn.test;

import javax.naming.Context;

public class ContextHolder {
	
	private static final ThreadLocal<Context> threadLocal=new ThreadLocal<Context>();
	
	public static void setContext(Context context){
		threadLocal.set(context);
	}
	
	public static Context getContext(){
		return threadLocal.get();
	}
	
	public static void clear(){
		threadLocal.remove();
	}

}
