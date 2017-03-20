package com.java.basis;

/**
 * this 将当前对象传递给其他方法使用
 * 
 * @author laijigong 2016年10月10日
 */
public class CheckThis2 {

	public static void main(String[] args) {
		new Person().eat(new Apple());
	}

}

class Person {
	public void eat(Apple apple) {
		Apple peeled = apple.getPeeler();
		System.out.println("yummy" + peeled);
	}
}

class Peeler {
	static Apple peel(Apple apple) {
		return apple;
	}
}

class Apple {
	Apple getPeeler() {
		return Peeler.peel(this);
	}
}