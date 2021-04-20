package com.atguigu.java3;
/*
 * 对属性可以赋值的位置：
 * ①默认初始化
 * ②显式初始化/⑤在代码块中赋值
 * ③构造器中初始化
 * ④有了对象以后，可以通过"对象.属性"或"对象.方法"的方式，进行赋值
 * 
 * 
 * 执行的先后顺序：① - ②/⑤ - ③ - ④
 * ②跟⑤先后看在类里面书写的先后
 */


public class A4OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		System.out.println(order.orderId);
	}
}

class Order{
	int orderId = 3;
	{
		orderId = 4;
	}
}
