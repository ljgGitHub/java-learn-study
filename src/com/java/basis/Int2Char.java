package com.java.basis;
/**
 * int ��char ���͵�ת��
 * int���� ��char���� �ڸ�ֵʱ�Զ�ת��
 * �ַ����͵����ݿ��Բμ���ֵ����
 * java�ײ��char���͵����������ǰ���int�����������
 * @author laijigong
 *2017��3��14��
 */
public class Int2Char {
	public static void main(String[] args) {
		char c=65;//���65��Ӧ��ASCII��-A
		int i='B';//���B��Ӧ��ASCII��ֵ66
		System.out.println(c+","+i);
		System.out.println((char)100);
		System.out.println((int)'c');
		
		
		//char���͵���ֵ����
		char c2='r';
		int i2=c2+1;
		c2=(char) (c2+1);
		System.out.println(i2);
		System.out.println(i2+c2);
	}

}
