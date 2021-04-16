package com.cess.day16;

import org.junit.Test;

public class ExceptionTest {
	@Test
	public void test() {
		// cmd + opt + z
		try {
			int[] arr = new int[3];
			System.out.println(arr[3]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
