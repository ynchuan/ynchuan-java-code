package com.ynchuan.code.factoryAbstract;

public class Defaultfactory  implements AbstractFactory {

	@Override
	public Food createFood() {
		// TODO Auto-generated method stub
		return new Apple();
	}

	@Override
	public Moveable createMoveable() {
		// TODO Auto-generated method stub
		return new Car();
	}

	@Override
	public Weapen createWeapen() {
		// TODO Auto-generated method stub
		return new AK();
	}

}
