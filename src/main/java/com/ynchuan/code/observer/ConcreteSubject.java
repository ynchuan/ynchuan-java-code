package com.ynchuan.code.observer;

public class ConcreteSubject extends Subject {
	String state;
	public void change(String state) {
		this.state = state;
		this.nodfyObservers(state);
	}
}
