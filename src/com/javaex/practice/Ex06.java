package com.javaex.practice;

public class Ex06 {
	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ %2;
		
		System.out.println(i); // i++ → 10 +1 → 11
		System.out.println(n); // (10/2)나머지 0 출력 이후 +1
	}
}
