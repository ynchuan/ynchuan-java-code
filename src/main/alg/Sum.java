package com.ynchuan.alg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("sum.in"));
			Writer writer = new FileWriter("sum.out");
			int n = scanner.nextInt();
			int s = 0;
			for (int i = 0; i < n; i++) {
				s += i;
			}
			writer.write(String.valueOf(s));
			writer.write("dss  1");
			writer.append("fd");
			scanner.close();
			writer.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}