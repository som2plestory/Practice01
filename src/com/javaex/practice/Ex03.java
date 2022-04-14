package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;
		
		System.out.println("a=" + a); // (++1)*2 → 2*2 → 4 
		System.out.println("b=" + b); // (1++)*2 → 1*2 → 2출력, 후 2*2 → 4
		System.out.println("x=" + x); // 2 @ 위에서 ++x → 1+1 → 2
		System.out.println("y=" + y); // 2 @ 위에서 y++ → 1+1 → 2
		
	}
	
}
