package com.cess.day13;

import org.junit.Test;

public class JUnitTest {
	@Test
	public void test() {
		Integer in1 = new Integer(10);
		int i1 = in1.intValue();
		String str2 = "123123";
		int i2 = Integer.valueOf(str2);
		System.out.println(i2);
	}
}
