package com.java.designModen;

/**
 * 创建型--设计模式之--饿汉式单利模式 
 * 定义：确保每个类只有一个实例，而且自行实例化并向整个系统提供这个实例
 * 饿汉式单例类在加载的时候，就实例化一个对象交给自己使用
 * 
 * 优点：
 * 1、在内存中只有一个对象，节省内存空间；
 * 2、避免频繁创建销毁对象，提升系统性能；
 * 3、避免对共享资源的多重占用；
 * 4、可以全局访问。
 * @author laijigong 2017年3月9日
 */
public class SingletonErhan {

	private static SingletonErhan singletonErhan = new SingletonErhan();

	private SingletonErhan() {

	}

	public static SingletonErhan getInstance() {
		return singletonErhan;
	}

}
