package com.patterns.staticProxy;

/**
 * @author lxchen
 * 静态代理的实现。对于实现代码以卖房(Subject的request方法)举例如下：
 * 卖房者(RealSubject)想卖房，不想搞那么多的麻烦，就委托中介(ProxySubject)
 * 去帮忙卖房，中介卖房当然需要收取中介费以及各种附加费用(preRequest()和postRequest()方法)
 * 最终买房者(客户端StaticProxyTest)买房，找到的是中介，不会与卖房者直接接触，与卖房者接触的是
 * 中介，买房者最终跟中介买房，完成操作
 * 
 * 以上是静态代理。真实角色必须是事前已经存在的，并将其作为代理对象的内部属性。但在实际使用时，
 * 一个真实角色必须对应一个代理角色，如果大量使用会导致类的急剧膨胀；此外，如果事前并不知道
 * 真实角色该如何代理呢?这就需要使用Java的动态代理解决
 * 
 * Java动态代理主要涉及一下两个类：
 * 1.InvocationHandler接口：接口仅定义了一个方法Object：invoke(Object obj,
 * Method method,Object[] args)。obj指代理类，method是指代理方法(request)
 * args为该方法的参数数组，这个抽象方法在代理类中动态实现
 * 2.Proxy：该类即为动态代理类，作用类似ProxySubject，主要包括的内容有：
 * Protected Proxy(InvocationHandler h)：构造函数，用于给内部的h赋值
 * Static Class getProxyClass(ClassLoader loader,Class[]intefaces):
 * 获得一个代理类，其中loader是类装载器，interfaces是真实类所拥有的全部接口的数组
 * Static Object newProxyInstance(ClassLoader loader,Class[]interfaces,
 * InvocationHandler h):返回代理类的一个实例，返回后的代理类可以当作被代理类使用(可使用被代理类的在
 * Subject接口中声明过的方法)
 * 
 * 详细的代码例子参加com.patterns.dynamicProxy
 */
public class StaticProxtTest {
	
	public static void main(String[] args) {
		Subject subject=new ProxySubject();
		subject.request();
	}

}
