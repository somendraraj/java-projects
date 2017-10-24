package com.java.strings;

public class MinReduceOperation {

	/* Minimum number of reduce operation to make a string palindrome */

	public static void main(String[] args) {

		String str = "abab";
		int res = minReduceOperation(str);
		System.out.println(res);
	}

	private static int minReduceOperation(String str) {
		int n = str.length();
		char[] ch = str.toCharArray();
		int res = 0;
		for (int i = 0; i < n / 2; i++) {
			res += Math.abs(ch[i] - ch[n - i - 1]);
		}
		return res;
	}

}
