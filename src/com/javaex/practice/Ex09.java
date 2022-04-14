package com.javaex.practice;

public class Ex09 {
	public static void main(String[] args) {
		
		double f = 80.0;
		
		/* System.out.println(5/9*(f-32.0)); */
		/*5/9 : int 5/ int 9 → 가우스 (소수점 첫째자리에서 내림한정수) : 0*/
		
		/* 5 or 9를 실수로 변환함 */
		System.out.println((double)5/9*(f - 32.0));
		
		
	}
}
