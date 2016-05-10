package com.patterns.staticProxy;

/**
 * @author lxchen
 * ��̬�����ʵ�֡�����ʵ�ִ���������(Subject��request����)�������£�
 * ������(RealSubject)���������������ô����鷳����ί���н�(ProxySubject)
 * ȥ��æ�������н�������Ȼ��Ҫ��ȡ�н���Լ����ָ��ӷ���(preRequest()��postRequest()����)
 * ��������(�ͻ���StaticProxyTest)�򷿣��ҵ������н飬������������ֱ�ӽӴ����������߽Ӵ�����
 * �н飬�������ո��н��򷿣���ɲ���
 * 
 * �����Ǿ�̬������ʵ��ɫ��������ǰ�Ѿ����ڵģ���������Ϊ���������ڲ����ԡ�����ʵ��ʹ��ʱ��
 * һ����ʵ��ɫ�����Ӧһ�������ɫ���������ʹ�ûᵼ����ļ������ͣ����⣬�����ǰ����֪��
 * ��ʵ��ɫ����δ�����?�����Ҫʹ��Java�Ķ�̬������
 * 
 * Java��̬������Ҫ�漰һ�������ࣺ
 * 1.InvocationHandler�ӿڣ��ӿڽ�������һ������Object��invoke(Object obj,
 * Method method,Object[] args)��objָ�����࣬method��ָ������(request)
 * argsΪ�÷����Ĳ������飬������󷽷��ڴ������ж�̬ʵ��
 * 2.Proxy�����༴Ϊ��̬�����࣬��������ProxySubject����Ҫ�����������У�
 * Protected Proxy(InvocationHandler h)�����캯�������ڸ��ڲ���h��ֵ
 * Static Class getProxyClass(ClassLoader loader,Class[]intefaces):
 * ���һ�������࣬����loader����װ������interfaces����ʵ����ӵ�е�ȫ���ӿڵ�����
 * Static Object newProxyInstance(ClassLoader loader,Class[]interfaces,
 * InvocationHandler h):���ش������һ��ʵ�������غ�Ĵ�������Ե�����������ʹ��(��ʹ�ñ����������
 * Subject�ӿ����������ķ���)
 * 
 * ��ϸ�Ĵ������Ӳμ�com.patterns.dynamicProxy
 */
public class StaticProxtTest {
	
	public static void main(String[] args) {
		Subject subject=new ProxySubject();
		subject.request();
	}

}
