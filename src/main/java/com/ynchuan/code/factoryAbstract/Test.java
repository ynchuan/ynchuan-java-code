package com.ynchuan.code.factoryAbstract;

public class Test {

	/**
	 * ���󹤳�ģʽ----����һ������������һ���Ʒ,���������绻Ƥ��
	 * һ�㹤���������Ʒ
	 * ���󹤳������Բ����µĲ�Ʒϵ�У����ǲ������Ӳ�ƷƷ��
	 * @param args
	 */
	public static void main(String[] args) {
     AbstractFactory vf=new Defaultfactory(); // --��չ˵��: ��ȷ����Ʒ���͵�����£��ؽ�������ʵ�ֲ�Ʒ�����
     Moveable m=vf.createMoveable();
     m.run();
     Weapen w=vf.createWeapen();
     w.shoot();
     Food f=vf.createFood();
     f.printName();
	}

}
