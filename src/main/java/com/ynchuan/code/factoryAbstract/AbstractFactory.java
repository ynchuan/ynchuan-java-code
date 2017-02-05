package com.ynchuan.code.factoryAbstract;

public interface AbstractFactory {
	Moveable createMoveable();
	Weapen   createWeapen();
	Food  createFood();
}
