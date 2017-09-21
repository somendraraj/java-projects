package com.ds.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayIsSubsetOfArray {

	private static boolean isArr1SubsetOfArr2(int[] arr1, int[] arr2) {
		int count = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j] == arr2[i]) {
					count++;
				}
			}
		}

		if (count >= arr2.length) {
			return true;
		}

		return false;
	}

	/**
	 * use sorting and binary search time complexity will be O(NlogN)
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	private static boolean isSubSet(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		for (int i = 0; i < arr2.length; i++) {
			int bool = binarySearch(arr1, arr2[i]);
			if (bool == -1)
				return false;
		}
		return true;
	}

	private static int binarySearch(int[] arr, int key) {
		int l = 0;
		int r = arr.length - 1;

		while (l < r) {
			int mid = (l + r) / 2;
			if (arr[mid] == key)
				return key;
			if (arr[mid] > key)
				r = mid - 1;
			if (arr[mid] < key)
				l = mid + 1;
		}
		return -1;
	}
	
	private static boolean isSubset(int[] arr1, int[] arr2){
		Map<Integer, Integer> map = new HashMap();
		for(int i=0;i<arr1.length;i++){
			map.put(arr1[i], 1);
		}
		for(int i=0;i<arr2.length;i++){
			if(!map.containsKey(arr2[i]))
				return false;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr2 = { 2, 3, 7, 5, 13 };
		boolean bool = isArr1SubsetOfArr2(arr1, arr2);
		System.out.println(bool);

		boolean bool1 = isSubSet(arr1, arr2);
		System.out.println(bool1);
		
		boolean bool2 = isSubset(arr1, arr2);
		System.out.println(bool2);
	}

}
