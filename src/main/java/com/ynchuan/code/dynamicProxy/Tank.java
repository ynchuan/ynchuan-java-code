package com.ynchuan.code.dynamicProxy;

public class Tank implements Moveable {

	@Override
	public void move() {
		System.out.println("tank running~~~");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
