package com.java.basis;

/**
 * ����this�ؼ��֣��ڷ�����������ʾ���ø÷������Ǹ����������
 * 
 * @author laijigong 2016��10��10��
 */
public class CheckThis {
	int i = 0;

	CheckThis incriment() {
		i++;
		return this;
	}

	void print() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		CheckThis x = new CheckThis();
		//incriment�����˶Ե�ǰ��������ã������ܶ�ͬһ������ִ�ж�β���
		x.incriment().incriment().incriment().incriment().print();
		;
	}
}
