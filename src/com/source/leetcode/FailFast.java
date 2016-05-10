package com.source.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

	public static void main(String[] args) {
		
		List<String> strList=new ArrayList<String>();
		strList.add("sh");
		strList.add("bj");
		strList.add("ah");
		strList.add("ah");
		strList.add("ah");
		strList.add("wh");
		System.out.println(strList.size());
		
		for (String string : strList) {
			System.out.println(string);
			if(string.equals("ah"))
			strList.remove(string);
		}
		
		//System.out.println(strList.size());
		/*Iterator<String> strIte=strList.iterator();
		while(strIte.hasNext()){
			//System.out.println(strIte.next());
			if(strIte.next().equals("ah")){
				strIte.remove();
			}
		}*/
		
		/*for (String string : strList) {
			System.out.println(string);
		}
		System.out.println(strList.size());*/

	}

}
