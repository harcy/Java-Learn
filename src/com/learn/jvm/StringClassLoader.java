package com.learn.jvm;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class StringClassLoader {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c=Class.forName("java.lang.String");
		Method[] methods=c.getDeclaredMethods();
		for (Method m : methods) {
			String mod=Modifier.toString(m.getModifiers());
			System.out.print(mod+" "+m.getName()+"(");
			Class<?>[] ps=m.getParameterTypes();
			if(ps.length==0)
				System.out.print(")");
			for(int i=0;i<ps.length;i++){
				char end=i==ps.length-1?')':',';
				System.out.print(ps[i].getSimpleName()+end);
			}
			System.out.println();
		}

	}

}
