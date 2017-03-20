package com.java.basis;

/**
 * 测试this关键字，在方法里面它表示调用该方法的那个对象的引用
 * 
 * @author laijigong 2016年10月10日
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
		//incriment返回了对当前对象的引用，所以能对同一个对象执行多次操作
		x.incriment().incriment().incriment().incriment().print();
		;
	}
}
