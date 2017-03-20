package com.java.algorithm;

import java.util.Arrays;

public class XixueguiNumber {
	public static void main(String[] args) {
		
		for (int i = 10; i < 100; i++) {
			for (int j = i + 1; j < 100; j++) {
				int sum = i * j;
				if (sum >= 1000 && sum < 10000) {
					String[] t1 = (sum + "").split("");
					Arrays.sort(t1);
					String[] t2 = ("" + i + j).split("");
					Arrays.sort(t2);
					if (Arrays.equals(t1, t2)) {
						System.out.println(sum + "=" + i + "*" + j);
					}
				}
			}
		}
	}

}
