package com.ynchuan.code.alg;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class lottery {

	public static void main(String[] args) {
		try {
			Scanner scn = new Scanner(new File("lottery.in"));
			Writer write = new FileWriter(new File("lottery.out"));
			int n = scn.nextInt();
			System.out.println(n);
			write.write(n + "");
			scn.close();
			write.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
