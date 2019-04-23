package com.java0423;

public class Main3 {
	
	
	public static void main(String[] args) {
		/*
		Calculator c = new Calculator();
		System.out.println("결과 : " + c.Cal(10, 20));
		*/
		
		/*
		 * 문제) 변수와 메소드를 이용하여 계산기를 만든다.
		 * - 계산기 : 두 개의 숫자를 이용하여 연산
		 */ 
		
		System.out.println("결과(+) : " +Plus(30,10));
		System.out.println("결과(-) : " +Minus(30,10));
		System.out.println("결과(*) : " +Multipul(30,10));
		System.out.println("결과(/) : " +division(30, 10));
	}

	static int Plus (int a, int b) {
		int res = a+b;
		return res;
	}
	static int Minus (int a, int b) {
		int res = a-b;
		return res;
	}
	static int Multipul (int a, int b) {
		int res = a*b;
		return res;
	}
	static int division (int a, int b) {
		int res = a/b;
		return res;
	}
}
