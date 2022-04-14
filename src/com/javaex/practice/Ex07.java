package com.javaex.practice;

public class Ex07 {
	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i); // ++i → 1+10 →11
		System.out.println(n); // 1+ (10/2)나머지 0 → 1
		
	}
}
