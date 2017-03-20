package com.java.basis;
/**
 * int 和char 类型的转换
 * int类型 和char类型 在赋值时自动转换
 * 字符类型的数据可以参加数值运算
 * java底层对char类型的数据运算是按照int类型来处理的
 * @author laijigong
 *2017年3月14日
 */
public class Int2Char {
	public static void main(String[] args) {
		char c=65;//输出65对应的ASCII码-A
		int i='B';//输出B对应的ASCII码值66
		System.out.println(c+","+i);
		System.out.println((char)100);
		System.out.println((int)'c');
		
		
		//char类型的数值运算
		char c2='r';
		int i2=c2+1;
		c2=(char) (c2+1);
		System.out.println(i2);
		System.out.println(i2+c2);
	}

}
