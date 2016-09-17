package com.ynchuan.alg;

//Triangle
public class Triangle {
	private int s = 1, t = 4, n = 6;
	private int[][] result = new int[n][n];

	public int getTotle(int n) {
		if (n == 0)
			return n;
		else {
			return n * getTotle(n - 1);
		}
	}

	public void createTriangle() {
		int s = this.s;
		int l = this.n;
		int t = this.t + 1;
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < l; j++) {
				int extra = (s + j) / t == 0 ? 0 : 1;
				int tmp1 = (s + j) % t + extra;
				result[i][j] = tmp1;
			}
			s = result[i][l - 1] + 1;
			l--;
		}
	}

	public void printTriangle() {
		int l = this.n;
		for (int i = 0; i < l; i++) {
			String tmp = "";
			for (int j = 0; j < l; j++) {
				tmp += (result[j][i] != 0 ? result[j][i] + " " : "");
			}
			System.out.println(tmp + "\n");
		}
	}

	public static void main(String[] args) {
		Triangle ta = new Triangle();
		ta.createTriangle();
		ta.printTriangle();
		System.out.println("hello world");

	}

}
