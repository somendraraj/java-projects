package com.algo.searching;

public class BinarySearch {
	
	/**
	 * Iterative solution for binary search
	 * 
	 * @param arr
	 * @param key
	 * @return
	 */
	private static int binarySearch(int[] arr, int key) {
		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
			int mid = (l + r) / 2;
			if (arr[mid] == key)
				return mid;
			else if (arr[mid] < key)
				l = mid + 1;
			else
				r = mid - 1;
		}
		return -1;
	}
	
	
	private static int recursiveBinarySearch(int[] arr, int key, int l, int r){

		if(l<r){
			int mid = (l+r)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				return recursiveBinarySearch(arr, key, l, mid-1);
			else
				return recursiveBinarySearch(arr, key, mid+1, r);
		}
		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 5, 7, 11, 15 };
		int pos = binarySearch(arr, 2);
		System.out.println(pos);
		
		/**
		 * recursive binary search call
		 */
		int pos1 = recursiveBinarySearch(arr, 5, 0, arr.length);
		System.out.println(pos1);
	}
}
