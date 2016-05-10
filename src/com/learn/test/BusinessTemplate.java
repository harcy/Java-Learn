package com.learn.test;

public class BusinessTemplate<T> {
	
	private ProcessCallback<T> processCallback;
	
	public BusinessTemplate(ProcessCallback<T> processCallback){
		this.processCallback=processCallback;
	}
	
	public T process(){
		try{
			System.out.println(ContextHolder.getContext());
			return processCallback.process();
		}finally{
			ContextHolder.clear();
		}
	}

}
