package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		
		System.out.print("500원의 개수: ");
		int five_h = cs.nextInt();
		
		System.out.print("100원의 개수: ");
		int one_h = cs.nextInt();
		
		System.out.print("50원의 개수: ");
		int fifty = cs.nextInt();
		
		System.out.print("10원의 개수: ");
		int ten = cs.nextInt();
		
		System.out.println("동전의 총합은 " + (500*five_h + 100*one_h + 50*fifty + 10*ten));
		
		cs.close();
	}

}
