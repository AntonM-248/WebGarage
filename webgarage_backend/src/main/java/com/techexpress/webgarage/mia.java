package com.techexpress.webgarage;

public class mia {
	static int[] X = new int[256];
	static int count = 0;

static void miaDo(int a, int b, int c) {
	System.out.println(count);
	if (c > b) {
		count++;
	} else {
		for (int i = X[c - 1] + 1; i <= a; i++) {
			X[c] = i;
			miaDo(a, b, c + 1);
		}
	}
}

	public static void main(String[] args) {
		miaDo(321, 21, 1);
		System.out.println(count);
	}

}
