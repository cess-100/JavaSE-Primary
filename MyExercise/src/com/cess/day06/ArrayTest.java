package com.cess.day06;

import java.util.Scanner;
/**
 * @Description
 * @author cess  Email:270017772@qq.com
 * @version
 * @data Apr 8, 2020 11:38:43 AM
 */
public class ArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入学生人数：");
		int num = sc.nextInt();

		int[] scores = new int[num];
		int maxScore = 0;
		System.out.println("清输入学生成绩：");
		for (int i = 0; i < num; i++) {
			System.out.print("第" + (i + 1) + "个学生成绩：");
			scores[i] = sc.nextInt();
			if (scores[i] > maxScore) {
				maxScore = scores[i];
			}
		}

		System.out.println("最高分是：" + maxScore);
		for (int i = 0; i < scores.length; i++) {
			char grade;
			int substract = maxScore - scores[i];
			if (substract <= 10) {
				grade = 'A';
			} else if (substract <= 20) {
				grade = 'B';
			} else if (substract <= 30) {
				grade = 'C';
			} else {
				grade = 'D';
			}
			System.out.println("student " + i + " score is" + scores[i] + " grade is " + grade);
		}
		sc.close();
	}
}
