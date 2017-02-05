package com.ynchuan.code.proxy;

public class TankTimeProxy implements Moveable {
	Moveable t;// ���þۺϽ��о�̬�Ĵ���

	public TankTimeProxy(Moveable t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		long t1 = System.currentTimeMillis();
		t.move();
		long t2 = System.currentTimeMillis();
		System.out.println("time:"+(t2 - t1));
	}

}
