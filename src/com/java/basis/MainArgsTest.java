package com.java.basis;

/**
 * main������ʹ�ã���������ͨ��Run Configurations....����������ַ������飬Ȼ�����
 * 
 * @author laijigong 2017��3��14��
 */
public class MainArgsTest {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Run Configurations ����ĵ�һ������Ϊ��" + a);
		System.out.println("Run Configurations ����ĵڶ�������Ϊ��" + b);
		System.out.println("a+b=" + (a + b));
		System.out.println("a-b=" + (a - b));
		System.out.println("a*b=" + (a * b));
		System.out.println("a/b=" + (a / b));
	}
}
