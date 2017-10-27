package com.java.strings;

import java.util.Arrays;

public class ElementOccurOnes {
	
	private static void getOnce1(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]==arr[i]){
					arr[i] = arr[i]-arr[i];
					arr[j] = arr[j]-arr[j];
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				System.out.println(arr[i]);
			}
		}
	}
	
	private static void getOnce2(int[] arr){
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				System.out.println(arr[i]);
				break;
			}
		}
	}
	
	private static int elementOccurOnce(int[] arr){
		int res = arr[0];
		for(int i=1;i<arr.length;i++){
			res ^= arr[i];
		}
		return res;
	}
	
	public static void main(String args[]){
		int arr[] = {1,4,2,3,2,4,3,5,5};
		int res = elementOccurOnce(arr);
		System.out.println(res);
		
		
		int arr1[] = {1,4,2,1,3,2,3,5,5};
		getOnce1(arr1);
		
		int arr2[] = {1,4,2,3,2,4,3,5,5};
		getOnce2(arr);
	}

}
