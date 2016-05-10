package com.learn.javaBasic;

import java.util.HashMap;

/**
 * @author lxchen
 *	HashMap的key是需要进行比较的，而比较两个对象是通过hashcode
 *	和equals方法。首先得到这个元素的hashcode方法，再通过hash算法定位到需要
 *	放置的物理地址，若此刻这个物理地址位置上没有元素则直接存储在这个位置，
 *	若有则调用equals判断元素两个元素是否相同，相同就不存，不同就重新hash
 *	示例中的A、B和C对象，C对象重写了hashcode和equals方法，使得在put
 *	操作时判断两次的是相同的key，所以hashmapC只会输出一个<key,value>
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
