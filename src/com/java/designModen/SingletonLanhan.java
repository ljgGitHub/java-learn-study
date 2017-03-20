package com.java.designModen;

/**
 * ������--���ģʽ֮--����ʽ����ģʽ 
 * ���壺ȷ��ÿ����ֻ��һ��ʵ������������ʵ������������ϵͳ�ṩ���ʵ��
 * ����ʽ�������ڵ���ʵ��������ʱ�򣬲Ż�ʵ��������
 * 
 * �ŵ㣺
 * 1�����ڴ���ֻ��һ�����󣬽�ʡ�ڴ�ռ䣻
 * 2������Ƶ���������ٶ�������ϵͳ���ܣ�
 * 3������Թ�����Դ�Ķ���ռ�ã�
 * 4������ȫ�ַ��ʡ�
 * @author laijigong 2017��3��9��
 */
public class SingletonLanhan {
	private static SingletonLanhan singletonLanhan;

	private SingletonLanhan() {
		
	}

	public static synchronized SingletonLanhan getInstance() {
		if (singletonLanhan == null) {
			singletonLanhan = new SingletonLanhan();
		}
		return singletonLanhan;

	}
}
