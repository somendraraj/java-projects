package com.ds.arrays;

public class ReverseArray {
	
	private static void reverse(int[] arr){
		int len = arr.length;
		int[] rev = new int[len];
		for(int i=0;i<len;i++){
			rev[i] = arr[len-i-1];
			System.out.print(rev[i]+" ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		reverse(arr);
		

	}

}
