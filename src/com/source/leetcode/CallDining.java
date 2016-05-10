package com.source.leetcode;
import java.util.*;
import java.util.Map.Entry;


public class CallDining {

	/*@Override
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
	}*/
	
	public HashMap<Integer,String> init(String[] s)
	{
		HashMap<Integer,String> array=new HashMap<Integer,String>();
		int len=s.length;
		for(int i=0;i<len;i++)
		{
			array.put(i, s[i]);
		}
		return array;
	}
	
	public Integer ranNum(int number)
	{
		Random rand=new Random();
		int index=rand.nextInt(number);
		return index;
	}
	
	public static void main(String[] args) {
		
		String[] s={"SP","LXY","GQQ","QR","S","LJT","MG","XJN","Zhage","CL"};
		int length=s.length;
		CallDining cd=new CallDining();
		HashMap<Integer,String> SelectSet=cd.init(s);
		String nm=SelectSet.get(1);
		System.out.println(nm);
		Set<Entry<Integer, String>> set=SelectSet.entrySet();
		Iterator<Entry<Integer, String>> ite;
		for(ite=set.iterator();ite.hasNext();){
			String name=ite.next().getValue();
			System.out.println(name);
		}
		while(true)
		{
			int index=cd.ranNum(length);	        
	        if(SelectSet.containsKey(index))
	        {
	        	//break;
	        	/*try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("sleep failed");
				}*/
	        	System.out.println(index);
	        	System.out.println(SelectSet.get(index));
	        	break;
	        }
	        else
	        {
	           	continue;
	        }
		}
		
	}

}
