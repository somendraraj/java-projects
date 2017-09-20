package com.ds.hashing;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class PrintMissingNumber {
	
	
	private static void print(int[] arr, int s, int e){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++){
			map.put(arr[i], 1);
		}
		
		for(int i=s;i<=e;i++){
			if(!map.containsKey(i)){
				System.out.println(i);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {11, 12, 14, 16};
		print(arr, 11, 16);

	}

}
