package com.redis.operate;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class CrudOperate {

	private Jedis jedis;
	
	public void setConnection(){
		jedis=new Jedis("135.242.136.26");
	}
	
	public void stringOperate(){
		jedis.set("name", "jacky");
		System.out.println(jedis.get("name"));
		jedis.append("name", "i am rose,your lover");
		System.out.println(jedis.get("name"));
		
		jedis.del("name");
		System.out.println(jedis.get("name"));
		jedis.mset("name","chan","age","18","tel","517517");
		jedis.incr("age");
		System.out.println(jedis.get("name")+"---"+jedis.get("age")+"---"+
		jedis.get("tel"));
	}
	
	public void mapOperate(){
		jedis.hdel("use", "name","age","tel");
		Map<String,String> map=new HashMap<String,String>();
		map.put("name", "rose");
		map.put("age", "20");
		map.put("tel", "517517");
		jedis.hmset("user",map);
		
		List<String> userList=jedis.hmget("user", "name","age","tel");
		System.out.println(userList);
		
	}
	
	public void listOperate(){
		jedis.del("framework list");
		System.out.println(jedis.lrange("framework list", 0, -1));
		jedis.lpush("framework list", "spring");
		jedis.rpush("framework list", "struts2");
		jedis.lpush("framework list", "hibernate");
		System.out.println(jedis.lrange("framework list", 0, -1));
	}
	
	public static void main(String[] args) {
		CrudOperate crud=new CrudOperate();
		crud.setConnection();
		crud.stringOperate();
		crud.mapOperate();
		crud.listOperate();
	}
}
