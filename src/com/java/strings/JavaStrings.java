package com.java.strings;

public class JavaStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "This is string s1";//stores in string constant pool
		String s2 = new String("This is string s2");//strores in heap
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
