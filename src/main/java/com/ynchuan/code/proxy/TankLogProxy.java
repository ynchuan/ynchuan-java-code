package com.ynchuan.code.proxy;

public class TankLogProxy implements Moveable {
	Moveable t;// ���þۺϽ��о�̬�Ĵ���

	public TankLogProxy(Moveable t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		System.out.println("tank start....");
		t.move();
		System.out.println("tank stop .....");
	}

}
