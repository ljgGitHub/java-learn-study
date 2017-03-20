package com.java.designModen;

/**
 * 创建型--设计模式之----静态工厂方法模式 
 * 把创建方法设置为静态的 不需要实例化工厂类，所以，大多数情况下，我们会选用静态工厂方法模式
 * 
 * @author laijigong 2017年3月13日
 */
public class StaticFactoryMethod {
	public static void main(String[] args) {
		sendMail mailSender = sendFactory.creatMail();
		mailSender.send();
		sendSMS SMSSender = sendFactory.creatSMS();
		SMSSender.send();
	}
}

interface sender {
	public void send();
}

class sendSMS implements sender {
	@Override
	public void send() {
		System.out.println("this is send sms!");
	}
}

class sendMail implements sender {
	@Override
	public void send() {
		System.out.println("this is send mail!");

	}
}

class sendFactory {

	public static sendSMS creatSMS() {
		return new sendSMS();

	}

	public static sendMail creatMail() {
		return new sendMail();

	}

}
