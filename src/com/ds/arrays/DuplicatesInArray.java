package com.ds.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicatesInArray {

	/**
	 * using 2 loops we are brutally checking each elements of array. time
	 * complexity is O(n^2)
	 * 
	 * @param arr
	 * @return
	 */
	private static boolean isDuplicates(int[] arr) {
		int n = arr.length;
		if (n == 0)
			return false;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[j] == arr[i])
					return true;
			}
		}
		return false;
	}

	/**
	 * We can reduce the time complexity by using map O(n)
	 * 
	 * @param arr
	 * @return
	 */
	private static boolean isArrayContainsDuplicate(int[] arr) {
		if (arr.length == 0)
			return false;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				return true;
			}
		}
		return false;
	}

	private static boolean isDuplicate1(int[] arr) {
		if (arr.length == 0)
			return false;
		HashSet<Integer> appeared = new HashSet<Integer>();
		for (Integer n : arr) {
			if (!appeared.add(n))
				return true;
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 5 };
		boolean bool = isDuplicates(arr);
		System.out.println(bool);
		System.out.println(isArrayContainsDuplicate(arr));
		System.out.println(isDuplicate1(arr));
	}

}
