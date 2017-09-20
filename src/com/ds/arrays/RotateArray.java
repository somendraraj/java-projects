package com.ds.arrays;

public class RotateArray {
	
	/**
	 * 
	 * @param arr
	 * @param d
	 */
	
	private void leftRotate(int[] arr, int d){
		int l = 0;
		int n = arr.length-1;
		reverse(arr, l, d-1);
		reverse(arr, d, n);
		reverse(arr, l, n);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	/**
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 */
	private void reverse(int[] arr, int start, int end){
		int temp;
		while(start<end){
			temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		RotateArray obj = new RotateArray();
		obj.leftRotate(arr, 3);
	}

}
