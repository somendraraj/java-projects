package com.algo.searching;

public class LinearSearch {
	
	
	/**
	 * 
	 * Linear search in java
	 * 
	 * @param arr
	 * @param key
	 */
	private static void linearSearch(int[] arr, int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				System.out.println("Pos: "+i);
				break;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,0};
		linearSearch(arr, 5);
	}

}
