package com.ynchuan.code.strategy;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cat[] aa={new Cat(1,1),new Cat(5,5),new Cat(2,2),new Cat(8,8)};
        Datasort.sort(aa);
        Datasort.p(aa);
	}

}
