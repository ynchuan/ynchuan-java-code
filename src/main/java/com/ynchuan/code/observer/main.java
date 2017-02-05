package com.ynchuan.code.observer;
/**
 * �۲���ģʽ
 * ��������ⷢ��仯ʱ�����¼����⴫���Դ�����ط�������Ӧ
 * @author Administrator
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcertObserver co=new ConcertObserver();
		ConcreteSubject cs=new ConcreteSubject();
		cs.attach(co);//��ɹ۲��߶�������
		cs.change("111");//�����¼��仯ʱ�����¼������⴫��
	}

}
