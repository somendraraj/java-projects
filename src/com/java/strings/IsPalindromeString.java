package com.java.strings;

public class IsPalindromeString {
	
	private boolean isPalindrome(char[] ch, int low, int high){
		
		return (low>=high) || (ch[low] == ch[high] && isPalindrome(ch, low+1, high-1));
	}
	
	public void main(String args[]){
		String str = "abcdcba";
		char[] ch = str.toCharArray();
		System.out.println(isPalindrome(ch, 0, str.length()-1));
	}

}
