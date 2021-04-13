package com.cess.day07;

/*
1.	使用冒泡排序，实现如下的数组从小到大排序。
    int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
2.	如何反转上面的数组。请代码实现
3. 复制上述数组，得到一个新的数组
4. 使用线性查找，从上述数组中查找22是否存在。存在，返回所在位置的索引。不存在，输出提示信息。
5. 数组中常见的异常有哪些？请举例说明
 */
public class Exercise {
	public static void main(String[] args) {
		int[] arr = new int[] { 34, 5, 22, -98, 6, -76, 0, -3 };
//		for (int i = 0; i < arr.length - 1; i++) {
//			boolean isFlag = true;
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//					isFlag = false;
//				}
//			}
//			if (isFlag) {
//				break;
//			}
//		}
//		for (int i = 0; i < arr.length/2; i++) {
//			int temp = arr[i];
//			arr[i] = arr[arr.length-1-i];
//			arr[arr.length-1-i] = temp;
//		}
//		int[] arr1 = new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			arr1[i] = arr[i];
//		}
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
		int find = 22;
		boolean isFind = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				System.out.println("索引是："+i);
				isFind = true;
				break;
			}
		}
		if (!isFind) {
			System.out.println("没有找到");
			
		}
		
	}
}
