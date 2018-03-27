package com.leetcode.algorithm;

import java.util.Arrays;

//冒泡排序
public class BubbleSort {
	
	public static void bubbleSort(int[] arr){
		int length = arr.length;
		if (arr == null || length ==0) {
			return ;
		}
		//i表示轮询几轮
		for (int i = 1; i < length-1; i++) {
			//每一轮的对比交换
			for (int j = 0; j < length-i; j++) {
				if (arr[j] >= arr[j+1]) {
					int temp = arr[j];
			        arr[j] = arr[j+1];
			        arr[j+1] = temp;
				}
			}
		}
		
	} 

	public static void main(String[] args) {
		int[] arr = {3,6,2,7,1,56,21,9,12};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
