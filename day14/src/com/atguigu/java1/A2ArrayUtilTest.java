package com.atguigu.java1;

public class A2ArrayUtilTest {
    public static void main(String[] args) {

//		ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32, 34, 32, 5, 3, 54, 654, -98, 0, -53, 5};
        int max = A2ArrayUtil.getMax(arr);
        System.out.println("最大值为：" + max);

        System.out.println("排序前：");
        A2ArrayUtil.print(arr);

        A2ArrayUtil.sort(arr);
        System.out.println("排序后：");
        A2ArrayUtil.print(arr);
    }
}
