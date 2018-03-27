package com.leetcode.algorithm;

import java.util.Arrays;

//快速排序
public class QuickSort {
	
	public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
	
    public static int partition(int[] arr, int left, int right) {
		int pointer = left;
		int pointerKey = arr[left];
		for (int j = right; j >= left; j--) {
			if (arr[j] < pointerKey) {
				while (left < j && arr[left] <= pointerKey ) {
					left++;
				}
				swap(arr, left, j); 
			}
		}
        swap(arr, pointer, left); 
        return left;
    }

	
	public static void quickSort(int[] arr, int left, int right){
		if (left >= right) {
			return;
		}
		int pointer = partition(arr, left, right);
        quickSort(arr, left, pointer-1);
        quickSort(arr, pointer+1, right);
	}

	
	public static void sort(int[] arr){
		int length = arr.length;
		if (arr == null || length ==0) {
			return ;
		}
        quickSort(arr, 0, arr.length-1);
	}
	
	public static void main(String[] args) {
		int[] arr = {5,3,6,2,7,1,56,21,9,12};
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
