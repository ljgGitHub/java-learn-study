package com.java.designModen;

/**
 * 创建型--设计模式之----工厂方法模式 (Factory Method)
 * 定义：定义一个用于创建对象的接口，让子类决定实例化哪一个类，使一个类的实例化延迟到其他子类
 * 四要素：产品接口、产品实现、工厂接口、工厂实现
 * 优点：1、降低耦合度；2、易于扩展
 * 适用：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建
 * @author laijigong 2017年3月9日
 */
public class FactoryMethod {
	public static void main(String[] args) {
		IFactory factory = new Factory();
		IProduct products = factory.createProduct();
		products.productMethod();
	}
}

interface IProduct {
	public void productMethod();
}

class Product implements IProduct {
	@Override
	public void productMethod() {
		System.out.println("产品");
	}
}

interface IFactory {
	public IProduct createProduct();
}

class Factory implements IFactory {
	@Override
	public IProduct createProduct() {
		return new Product();
	}
}
