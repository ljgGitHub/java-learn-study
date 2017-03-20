package com.java.designModen;

/**
 * ������--���ģʽ֮--����ʽ����ģʽ 
 * ���壺ȷ��ÿ����ֻ��һ��ʵ������������ʵ������������ϵͳ�ṩ���ʵ��
 * ����ʽ�������ڼ��ص�ʱ�򣬾�ʵ����һ�����󽻸��Լ�ʹ��
 * 
 * �ŵ㣺
 * 1�����ڴ���ֻ��һ�����󣬽�ʡ�ڴ�ռ䣻
 * 2������Ƶ���������ٶ�������ϵͳ���ܣ�
 * 3������Թ�����Դ�Ķ���ռ�ã�
 * 4������ȫ�ַ��ʡ�
 * @author laijigong 2017��3��9��
 */
public class SingletonErhan {

	private static SingletonErhan singletonErhan = new SingletonErhan();

	private SingletonErhan() {

	}

	public static SingletonErhan getInstance() {
		return singletonErhan;
	}

}
