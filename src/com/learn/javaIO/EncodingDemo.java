package com.learn.javaIO;

import java.io.UnsupportedEncodingException;

public class EncodingDemo {
	
//	byte[] b=new byte[4];
//	String[] ss=new String[10];
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s="Ä½¿ÎABC";
		byte[] bytes1=s.getBytes();
		for(byte b:bytes1){
			//System.out.print(Integer.toHexString(b)+" ");
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		System.out.println();
		byte[] bytes2=s.getBytes("utf-8");
		for(byte b:bytes2){
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		System.out.println();
		byte[] bytes3=s.getBytes("utf-16be");
		for(byte b:bytes3){
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		System.out.println();
		String out=new String(bytes2,"utf-8");
		System.out.println(out);
	}
	

}
