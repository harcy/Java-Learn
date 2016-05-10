package com.learn.callback;

public class TestDemo {

	public static void main(String[] args) {
		
		Harcy harcy=new Harcy();
		Tina tina=new Tina(harcy);
		tina.ask("1+1=?");
	}
}
