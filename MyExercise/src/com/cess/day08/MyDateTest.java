package com.cess.day08;

/*
 * 5.声明一个日期类型MyDate:有属性:年year,月month，日day。创建2个日期 对象，
 * 分别赋值为:你的出生日期，你对象的出生日期，并显示信息。
 */

public class MyDateTest {
	public static void main(String[] args) {
		MyDate me = new MyDate();
		me.year = 1985;
		me.month = 10;
		me.day = 20;

		MyDate her = new MyDate();
		her.year = 1995;
		her.month = 6;
		her.day = 18;

		System.out.print("我的生日为");
		me.info();
		System.out.print("她的生日为");
		her.info();
	}

}

class MyDate {
	int year;
	int month;
	int day;

	public void info() {
		System.out.println("出生年月日为" + year + "年" + month + "月" + day + "日");
	}
}