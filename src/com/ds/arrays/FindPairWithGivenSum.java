package com.ds.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindPairWithGivenSum {
	
	/**
	 * using 2 loops we can get all the pairs of numbers
	 * 
	 * time complexity is O(n^2)
	 * 
	 * @param arr
	 * @param k
	 */
	
	private static void findPairs(int[] arr, int k){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]+arr[i]==k){
					System.out.println(arr[j]+" "+arr[i]);
				}
			}
		}
	}
	
	private static void findPair1(int[] arr, int k){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(k-arr[i])){
				int val = k-arr[i];
				System.out.println(arr[i]+" "+ val);
			}	
			map.put(arr[i], 1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 0, 5, 3, 7, 8 };
		
		//findPairs(arr, 8);
		
		findPair1(arr, 8);

	}

}
