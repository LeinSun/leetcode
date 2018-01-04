package com.leetcode;

import java.util.Arrays;
/**
 * 
There are two sorted arrays nums1 and nums2 of size m and n respectively.
Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0

Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5

 * @author eybcccg
 *
 */
public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		MedianOfTwoSortedArrays  m = new MedianOfTwoSortedArrays();
		int[] a = {1,2};
		int[] b = {3,4};
		System.out.println(m.findMedianSortedArrays(a,b));

	}
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length+nums2.length];
		if (nums1.length == 0) {
			result = nums2;
		}else if (nums2.length == 0) {
			result = nums1;
		}else if (nums2.length == 0 && nums1.length == 0) {
			return 0;
		}else {
			System.arraycopy(nums1, 0, result, 0, nums1.length);
			System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
			Arrays.sort(result);
		}
		
		int length = result.length;
		double median = 0;
		if (length % 2 == 0) {
			median = ((double)(result[length/2-1] + result[length/2])) / 2;
		}else {
			median = result[(length-1)/2];
		}
		return median;
        
    }
	
	//最优解看不动

}
