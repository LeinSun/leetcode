package com.leetcode.algorithm;

import java.util.Arrays;

//选择排序
public class SelectSort {

	public static void selectSort(int[] arr){
		int length = arr.length;
		if (arr == null || length ==0) {
			return ;
		}
		//i表示轮询几轮
		for (int i = 0; i < length; i++) {
			int mix = arr[i];
			int index = i;
			for (int j = i; j < length; j++) {
				if (mix > arr[j]) {
					mix = arr[j];
					index = j;
				}
			}
	        arr[index] = arr[i];
	        arr[i] = mix;
		}
		
	} 
	
	public static void main(String[] args) {
		int[] arr = {3,6,2,7,1,56,21,9,12};
		selectSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
