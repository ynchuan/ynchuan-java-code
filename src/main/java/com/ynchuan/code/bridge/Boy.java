package com.ynchuan.code.bridge;

public class Boy {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void pursue(MM m) {
		Gift g = new Warm(new Flower());//ʵ�������A��B�����ϣ�����ʹ�þۺ�ʵ�����������
		give(g, m);
	}

	public void give(Gift g, MM m) {

	}
}
