package com.learn.jvm;

/**
 * @author lxchen
 * Final字段不会引起类的初始化
 */
public class UseFinalField {

	public static void main(String[] args) {
		
		System.out.println(FinalFieldClass.CONST_STR);

	}

}
