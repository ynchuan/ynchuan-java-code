package com.ynchuan.code.alg;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

//convert
public class convert {
	public static void main(String[] args) {
		Scanner sc;
		try {
			sc = new Scanner(new File("convert.in"));
			Writer write = new FileWriter(new File("convert.out"));
			int n = sc.nextInt();
			String[] strArr = new String[n];
			for (int i = 0; i < n; i++) {
				strArr[i] = sc.next();
			}
			convert cv = new convert();
			cv.convertWords(strArr);
			for (int i = 0; i < n; i++) {
				write.write(strArr[i] + "\n");
			}
			sc.close();
			write.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public String convertWord(String str) {
		String out = "";
		char fc = str.charAt(0);
		if (!Character.isLowerCase(fc)) {
			out = "error";
		} else {
			out += String.valueOf(fc);
			for (int i = 1; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c == '_') {
					i++;
					c = str.charAt(i);
					out += String.valueOf(Character.toUpperCase(c));
				} else if (Character.isUpperCase(c)) {
					out += String.valueOf("_" + Character.toLowerCase(c));
				} else {
					out += String.valueOf(c);
				}
			}
		}
		return out;
	}

	public String[] convertWords(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = this.convertWord(strArr[i]);
		}
		return strArr;
	}
}
