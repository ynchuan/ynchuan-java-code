package com.ynchuan.code.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ���۲����⣨���۲��ߣ�
 * 
 * @author Administrator
 * 
 */
public abstract class Subject {

	List<Observer> olst = new ArrayList<Observer>();

	public void attach(Observer o) {
		olst.add(o);
	}

	public void detach(Observer o) {
		olst.remove(o);
	}

	public void nodfyObservers(String state) {
		for (Observer o : olst) {
			o.update(state);
		}
	}
}
