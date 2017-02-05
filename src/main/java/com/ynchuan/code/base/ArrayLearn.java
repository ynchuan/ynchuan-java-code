package com.ynchuan.code.base;

import java.util.Arrays;

public class ArrayLearn extends LearnBase {

	public static void main(String[] args) {
		System.out.println("hello java!");
		String str1[] = { "com", "ynchuan", "code" };
		String[] str2 = { "com", "ynchuan", "code" };
		String[] str3 = new String[] { "com", "ynchuan", "code" };// 不能指定
		String[] str4 = new String[3];
		str4[0] = "com";
		str4[0] = "ynchuan";
		str4[0] = "code";
		LearnBean[] beans = new LearnBean[2];
		// beans[0].setSubject("array");
		// beans[1].setSubject("cycle");
		Arrays.sort(str3);
		System.out.println("Arrays.toString(str3)=" + Arrays.toString(str3));
		String test = "test";
		deal(test);// string是特殊对象，多以传递的是形参，string[]传递的是指针
		System.out.println("test=" + test);
		forEach(str1);
		forLoop(str3);
	}

	public static void deal(String str) {
		str = str + "01";
	}

	public static void forEach(String[] strs) {
		for (String str : strs) {
			System.out.println(str);
		}
	}

	public static void forLoop(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}