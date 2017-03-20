package com.java.designModen;

/**
 * ������--���ģʽ֮----��̬��������ģʽ 
 * �Ѵ�����������Ϊ��̬�� ����Ҫʵ���������࣬���ԣ����������£����ǻ�ѡ�þ�̬��������ģʽ
 * 
 * @author laijigong 2017��3��13��
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
