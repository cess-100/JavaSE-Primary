package com.atguigu.java2;

public class InnerClassTest1 {	
	//返回一个实现了Comparable接口的类的对象
	public Comparable getComparable(){
		//创建一个实现了Comparable接口的类:局部内部类
		//方式一：
		class MyComparable implements Comparable{
			@Override
			public int compareTo(Object o) {
				return 0;
			}	
		}
		return new MyComparable();
		//方式二：
//		return new Comparable(){
//			@Override
//			public int compareTo(Object o) {
//				return 0;
//			}		
//		};
	}
	
}
