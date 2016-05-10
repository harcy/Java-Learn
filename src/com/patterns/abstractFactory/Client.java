package com.patterns.abstractFactory;

/**
 * @author lxchen
 * 抽象工厂模式：在工厂模式的基础上增加了一层抽象概念。跟工厂模式的比较，不难发现
 * 抽象工厂模式只是增加了一层抽象的概念，抽象工厂是一个父类工厂，可以创建其它
 * 工厂类，所以有时称抽象工厂模式为"工厂的工厂"
 * 抽象工厂的参与值：
 * 	1.抽象工厂：声明了一组用于创建一族产品的方法，每一个方法对应一种产品；
 * 	2.具体工厂：它实现了在抽象工厂中申明的创建产品的方法，生成一组具体的产品，
 *          这些产品构成了一个产品族，每一个产品都位于某个产品等级结构中
 *  3.抽象产品：它为每种产品申明接口，
 *  4.具体产品：它定义具体工厂生产的具体产品对象，实现抽象产品接口中申明的业务方法
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
