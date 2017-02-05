package com.ynchuan.code.factorySpring;

import java.util.Properties;

public class Test {

	/**
	 * ��ͨ����󹤳���ȡ��Ʒ����Ʒ�����ͱȽ�ȷ��
	 * ͨ��spring��ioc��ͨ������ƣ����Ի�ȡ������͵Ĳ�Ʒ��ǰ���ǲ�Ʒ�������Ѿ����������ߵ�Ĭ�ϣ���car=Car,key=carʱ�����߽���������ΪCar����֤����Ҳ�ǳ��󹤳������������͵����߽���취
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Properties pros = new Properties();
		try {
			pros.load(Test.class.getClassLoader().getResourceAsStream(
					"Factory_spring/spring.property"));
			String vehicleTypeName = pros.getProperty("vehicleType");
			Object o = Class.forName(vehicleTypeName).newInstance();
			Moveable m = (Moveable) o;//�˴�ʵ���˲�Ʒ���͵�����ָ��
			m.run();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
