package com.ynchuan.code.strategy;

/**
 * ð����ϣ����
 * 
 * @author Administrator
 * 
 */
public class Datasort {

	public static void sort(Comparable[] aa) {
		for (int i = 0; i < aa.length-1; i++) {
			for (int j = 0; j < aa.length - i - 1; j++) {
				if (aa[j].compare(aa[j+1])==1) {
					swap(aa, j, j + 1);
				}
			}
		}

	}

	private static void swap(Object[] aa, int i, int j) {
		Object temp = aa[i];
		aa[i] = aa[j];
		aa[j] = temp;
	}

	public static void p(Object[] aa) {
		for (Object a : aa) {
			System.out.println(a.toString() + ",");
		}
	}

}
