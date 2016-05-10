package com.learn.javaBasic;

import java.util.HashMap;

/**
 * @author lxchen
 *	HashMap��key����Ҫ���бȽϵģ����Ƚ�����������ͨ��hashcode
 *	��equals���������ȵõ����Ԫ�ص�hashcode��������ͨ��hash�㷨��λ����Ҫ
 *	���õ������ַ�����˿���������ַλ����û��Ԫ����ֱ�Ӵ洢�����λ�ã�
 *	���������equals�ж�Ԫ������Ԫ���Ƿ���ͬ����ͬ�Ͳ��棬��ͬ������hash
 *	ʾ���е�A��B��C����C������д��hashcode��equals������ʹ����put
 *	����ʱ�ж����ε�����ͬ��key������hashmapCֻ�����һ��<key,value>
 */
public class HashMapObj {

	public static void main(String[] args) {
		HashMap<A,Integer> hashmapA=new HashMap<A,Integer>();
		A a1=new A();
		System.out.println(a1.hashCode());
		hashmapA.put(a1,10);
		A a2=new A();
		System.out.println(a2.hashCode());
		hashmapA.put(a2, 5);
		System.out.println(a1.equals(a2));
		System.out.println("hashmapA Elements:");
		System.out.print("\t"+hashmapA+"\n");
		
		HashMap<B, Integer> hashmapB=new HashMap<B,Integer>();
		B b1=new B();
		System.out.println(b1.hashCode());
		hashmapB.put(b1, 10);
		B b2=new B();
		System.out.println(b2.hashCode());
		hashmapB.put(b2, 5);
		System.out.println(b1.equals(b2));
		System.out.println("hashmapB Elements:");
		System.out.print("\t"+hashmapB+"\n");
		
		HashMap<C,Integer> hashmapC=new HashMap<C,Integer>();
		C c1=new C();
		System.out.println(c1.hashCode());
		hashmapC.put(c1, 10);
		C c2=new C();
		System.out.println(c2.hashCode());
		hashmapC.put(c2, 5);
		System.out.println(c1.equals(c2));
		System.out.println("hashmapC Elements:");
		System.out.print("\t"+hashmapC+"\n");
	}

}
