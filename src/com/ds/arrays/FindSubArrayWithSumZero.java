package com.ds.arrays;

public class FindSubArrayWithSumZero {
	
	/**
	 * naive solution using two loops time complexity O(n^2)
	 * @param arr
	 */

	private static void printSubArrays(int[] arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum = 0;
			for(int j=i;j<arr.length;j++){
				sum+=arr[j];
				if(sum==0){
					print(arr, i, j);
				}
			}
		}
	}
	
	private static void print(int[] arr, int start, int end){
		for(int i=start;i<=end;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {4, 2, -3, -1, 0, 4};
		
		printSubArrays(arr);

	}

}
