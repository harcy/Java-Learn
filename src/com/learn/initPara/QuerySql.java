package com.learn.initPara;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class QuerySql {
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		User u=new User();
		u.setAge(18);
		String s=QuerySql.query(u);
	    System.out.println(s);
	}
	
	public static String query(User u) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		StringBuffer sb=new StringBuffer();
		//1.get table name
		Class c=u.getClass();
		Table table=(Table)c.getAnnotation(Table.class);
		String tableName=table.value();
		sb.append("select * from ").append(tableName).append(" where 1=1");
		System.out.println(sb.toString());
		//2.get field name and field value
		//2.1 get field name
		Field[] field=c.getDeclaredFields();
		for(Field f:field){
			Column col=(Column)f.getAnnotation(Column.class);
			String colName=col.value();
			if(!colName.equals("age"))
				continue;
			else{
				Method[] ms=c.getDeclaredMethods();
				for(Method m:ms){
					System.out.println(m.getName());
					System.out.println("get"+colName);
					if(m.getName().equalsIgnoreCase("get"+colName)){
						int colValue=(int)m.invoke(u);
						System.out.println(colValue);
						sb.append(" and ").append(colName).append("=").append(colValue);
					}
					else
						continue;
				}				
			}
			System.out.println(colName);
			//2.2 get field value
			
		}
		return sb.toString();
	}

}
