package com.java.basis;

public class ArrayDemo {
	public static void main(String[] args) {
		// int array[] = null;
		// array = new int[5];
		// for (int i = 0; i < array.length; i++) {
		// array[i] = i * 2 + 1;
		// System.out.println(array[i]);
		// }
		int array[] = { 1, 2, 3, 4, 5, 6, 67, 8, 9, 74, 99 };
		// int max, min;
		// max = min = array[0];
		// for (int i = 0; i < array.length; i++) {
		// if (max < array[i]) {
		// max = array[i];
		// }
		// if (min > array[i]) {
		// min = array[i];
		// }
		// int j = array[i];
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.print("µÚ" + (i + 1) + "ÅÅĞò:"+array[i]+"  ");
		}
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
