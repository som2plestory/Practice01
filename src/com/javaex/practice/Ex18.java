package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		
		System.out.print("화씨: ");
		double f = cs.nextDouble();
		
		double celsius = (double)5/9*( f -32);
		
		System.out.println("화씨 " + f + " 의 섭씨온도는" + celsius +" 입니다." );
		
		cs.close();
	}
	
}
