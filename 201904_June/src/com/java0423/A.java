package com.java0423;

public class A {
	// 기본 생성자
	public A(){
		new B("Hi~?");	// B클래스 생성자 생성
	}
	public A(String msg) {
		System.out.println("B : " + msg);
	}
}
