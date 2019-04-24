package com.java0423;

public class Main3 {
	static String Repeat(String str)
	{
		return str;
	}
	
	public void main(String[] args) {
		/* 클래스를 만들라는 조건이 없었어...
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
		System.out.println("결과(%) : " +Na(30, 10));
		
		System.out.println("Ex) : " + Repeat("STR"));
	}
	// main Method -> static // 그래서 메서드 생성시 static을 사용
	static int Plus (int a, int b) {
		return a+b;
	}
	static int Minus (int a, int b) {
		return a-b;
	}
	static int Multipul (int a, int b) {
		return a*b;
	}
	static int division (int a, int b) {
		return a/b;
	}
	static int Na(int a, int b) {
		return a%b;
	}
}
