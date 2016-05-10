package com.patterns.abstractFactory;

/**
 * @author lxchen
 * ���󹤳�ģʽ���ڹ���ģʽ�Ļ�����������һ�������������ģʽ�ıȽϣ����ѷ���
 * ���󹤳�ģʽֻ��������һ�����ĸ�����󹤳���һ�����๤�������Դ�������
 * �����࣬������ʱ�Ƴ��󹤳�ģʽΪ"�����Ĺ���"
 * ���󹤳��Ĳ���ֵ��
 * 	1.���󹤳���������һ�����ڴ���һ���Ʒ�ķ�����ÿһ��������Ӧһ�ֲ�Ʒ��
 * 	2.���幤������ʵ�����ڳ��󹤳��������Ĵ�����Ʒ�ķ���������һ�����Ĳ�Ʒ��
 *          ��Щ��Ʒ������һ����Ʒ�壬ÿһ����Ʒ��λ��ĳ����Ʒ�ȼ��ṹ��
 *  3.�����Ʒ����Ϊÿ�ֲ�Ʒ�����ӿڣ�
 *  4.�����Ʒ����������幤�������ľ����Ʒ����ʵ�ֳ����Ʒ�ӿ���������ҵ�񷽷�
 */
public class Client {
	
	public static CPUFactory createSpecificFactory(){
		int sys=0;
		if(sys==0)
			return new AMDFactory();
		else
			return new IntelFactory();
	}

	public static void main(String[] args) {
		new Computer(createSpecificFactory());
	}

}
