package com.atguigu.java1;

public class ArrayPrintTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr); //地址值

        /*
         * 上面调用println重载方法中的 println(Object) 这里是返回地址
         * 下面调用println重载方法中 println(char[]) 这里是遍历
         */
        char[] arr1 = new char[]{'a', 'b', 'c'};
        System.out.println(arr1); //abc
    }
}
