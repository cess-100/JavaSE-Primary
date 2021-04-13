package com.cess.day07;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[] arr = new int[6];

		int count = 0;
		label:while (true) {
			int random = (int) (Math.random() * 30 + 1);
			for (int i = 0; i <= count; i++) {
				if (random == arr[i]) {
					continue label;
				}
			}
			arr[count++] = random;
			if (count == 6) {
				break;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
