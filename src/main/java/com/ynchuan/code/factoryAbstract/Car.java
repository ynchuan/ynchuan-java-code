package com.ynchuan.code.factoryAbstract;

import java.util.LinkedList;
import java.util.List;

public class Car implements Moveable {
	public static Car car = new Car();// ---����
	public static List<Car> cars = new LinkedList<Car>();// ---����

	/**
	 * ��̬�������� ----ֻҪ���Կ��ƶ���Ĳ���ķ���������������Ϊ������������--ʵ�ֵ��� --ʵ�ֶ���
	 * 
	 * @return
	 */
	public static Car getInstance() {
		return car;
	}

	/**
	 * ��̬�������� ----ֻҪ���Կ��ƶ���Ĳ���ķ���������������Ϊ��������---�򵥹���
	 * 
	 * @return
	 */
	public static Car getInstance1() {
		if (car != null) {
			return car;
		} else {
			return new Car();
		}
	}

	public void run() {
		System.out.println("-----running--");
	}
}
