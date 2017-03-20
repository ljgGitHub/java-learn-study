package com.java.algorithm;

public class PeibonaqiShuLie {
	public static void main(String args[]) {
		for (int i = 0; i < 20; i++) {
			int nums = fibonacci(i);
			System.out.print(nums+" ");
		}
	}

	static int fibonacci(int n) {
		if (n <= 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
