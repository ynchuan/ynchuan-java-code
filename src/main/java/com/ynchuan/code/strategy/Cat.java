package com.ynchuan.code.strategy;

public class Cat implements Comparable {
	private int height;
	private int width;
	private Comparator comparator = new CatWidthCompraptor();

	public Cat(int i, int j) {
		this.height = i;
		this.width = j;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setComparator(Comparator comparator) {
		this.comparator = comparator;
	}

	@Override
	public int compare(Object o) {
		return comparator.compare(this, o);
	}

	@Override
	public String toString() {
		return height + "|" + width;
	}

}
