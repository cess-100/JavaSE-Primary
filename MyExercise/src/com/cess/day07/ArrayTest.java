package com.cess.day07;
/**
 * 
 * @Description
 * @author cess  Email:270017772@qq.com
 * @version
 * @data Apr 8, 2020 4:16:52 PM
 *
 */
public class ArrayTest {
	public static void main(String[] args) {
		int[][] arr = {{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
}
