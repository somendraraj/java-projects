package com.ds.arrays;

public class FindElementInSortedRotatedArray {
	
	
	static int findIndex(int[] arr, int n, int key){
		int pivot = findPivot(arr, 0, n-1);
		if(pivot == -1)
			return search(arr, 0, n-1, key);
		if(arr[pivot]==key)
			return pivot;
		if(arr[0]<key)
			return search(arr, 0, pivot-1, key);
		return search(arr, pivot+1, n-1, key);
	}
	
	static int findPivot(int[] arr, int l, int r){
		if(l>r)
			return -1;
		if(l==r)
			return l;
		int mid = (l+r)/2;
		if(mid<r && arr[mid]>arr[mid+1])
			return mid;
		if(mid<r && arr[mid]<arr[mid-1])
			return mid-1;
		if(arr[l]>=arr[mid])
			return findPivot(arr, l, mid-1);
		return findPivot(arr, mid+1, r);
	}
	
	static int search(int[] arr, int low, int high, int key){
		if(high<low)
			return -1;
		int mid = (low+high)/2;
		if(arr[mid]==key)
			return mid;
		if(arr[mid]<key)
			return search(arr, mid+1, high, key);
		return search(arr, low, mid-1, key);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int key = 3;
		int pos = findIndex(arr, arr.length, key);
		System.out.println(pos);

	}

}
