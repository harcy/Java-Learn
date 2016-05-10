package com.patterns.abstractFactory;

/**
 * @author lxchen
 * 工厂模式：根据不容的参数创建对象，工厂根据不同的参数为我们提供不同的物品
 * e.g.下面的示例有一个造人的工厂，根据参数为Boy和Girl的不容，工厂可以
 * 创建出Boy和Girl对象给我们
 */
public class HumanFactory {
	
	public static Human createHuman(String sex){
		Human human = null;
		if(sex.equals("Boy"))
			human=new Boy();
		if(sex.equals("Girl"))
			human=new Girl();
		return human;
	}

	public static void main(String[] args) {
		
		Human human=HumanFactory.createHuman("Girl");
		human.Walk();
		human.Talk();
		Human human2=HumanFactory.createHuman("Boy");
		human2.Walk();
		human2.Talk();

	}

}
