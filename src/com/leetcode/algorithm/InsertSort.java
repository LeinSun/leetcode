package com.leetcode.algorithm;

import java.util.Arrays;

public class InsertSort {

	public static void insertSort(int[] arr){
		int i, j;
	    int n = arr.length;
	    int target;
	 
	    //假定第一个元素被放到了正确的位置上
	    //这样，仅需遍历1 - n-1
	    for (i = 1; i < n; i++)
	    {
	        j = i;
	        target = arr[i];
	 
	        while (j > 0 && target < arr[j - 1])
	        {
	            arr[j] = arr[j - 1];
	            j--;
	        }
	 
	        arr[j] = target;
	    }
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3,6,2,7,1,56,21,9,12};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
