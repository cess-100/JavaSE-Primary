package com.cess.day08;

public class OOPTest {
	
}

class TestReview{
	public static int getVolume(int area, int height){
		return area * height;
	}
	public static double getArea(double lenght, double width){
		return lenght * width;
	}
	public static void main(String[] args){
		int a = 2;//长
		int b = 3;//宽
		int h = 4;//高
		double area = getArea(a,b);//把方法的返回值赋值给一个变量
									//变量area的类型要与 方法getArea()的返回值类型 一致
		//int v = getVolume(getArea(a,b) ,h);//错误 
									//getArea(a,b)的返回值类型是double，而getVolume()的第一个形参是int
		double v = getArea(a,b) * h; //把方法的返回值 作为表达式的一部分
		
		System.out.println(area + " " + v);
	}
}
