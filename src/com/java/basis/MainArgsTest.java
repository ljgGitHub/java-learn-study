package com.java.basis;

/**
 * main方法的使用，参数可以通过Run Configurations....输入参数给字符串数组，然后输出
 * 
 * @author laijigong 2017年3月14日
 */
public class MainArgsTest {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Run Configurations 输入的第一个变量为：" + a);
		System.out.println("Run Configurations 输入的第二个变量为：" + b);
		System.out.println("a+b=" + (a + b));
		System.out.println("a-b=" + (a - b));
		System.out.println("a*b=" + (a * b));
		System.out.println("a/b=" + (a / b));
	}
}
