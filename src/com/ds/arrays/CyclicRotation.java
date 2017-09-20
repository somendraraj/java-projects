package com.ds.arrays;

public class CyclicRotation {
	
	private static void rotate(int[] arr){
		int x = arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--){
			arr[i] = arr[i-1];
		}
		arr[0] = x;
	}
	
	private static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		print(arr);
		rotate(arr);
		print(arr);
		
		

	}

}
