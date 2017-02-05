package com.ynchuan.code.factorySimple;

public class Carfactory implements VehicleFactory {

	@Override
	public Moveable create() {
		Moveable  m=new Car();
		return m;
	}



}
