package com.java.designModen;

/**
 * ������--���ģʽ֮----��������ģʽ (Factory Method)
 * ���壺����һ�����ڴ�������Ľӿڣ����������ʵ������һ���࣬ʹһ�����ʵ�����ӳٵ���������
 * ��Ҫ�أ���Ʒ�ӿڡ���Ʒʵ�֡������ӿڡ�����ʵ��
 * �ŵ㣺1��������϶ȣ�2��������չ
 * ���ã����ǳ����˴����Ĳ�Ʒ��Ҫ���������Ҿ��й�ͬ�Ľӿ�ʱ������ͨ����������ģʽ���д���
 * @author laijigong 2017��3��9��
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
		System.out.println("��Ʒ");
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
