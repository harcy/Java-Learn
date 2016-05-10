package com.patterns.abstractFactory;

/**
 * @author lxchen
 * ����ģʽ�����ݲ��ݵĲ����������󣬹������ݲ�ͬ�Ĳ���Ϊ�����ṩ��ͬ����Ʒ
 * e.g.�����ʾ����һ�����˵Ĺ��������ݲ���ΪBoy��Girl�Ĳ��ݣ���������
 * ������Boy��Girl���������
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
