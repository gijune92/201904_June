package com.java0424;

public class Calc {

	public int plus(int a, int b)
	{
		return (a+b);
	}
	public int minus(int a, int b)
	{
		return (a-b);
	}
	public float multiful(int a, int b){
	// float 명시적 형변환
		return(float)(a*b);
	}
	public float division(int a, int b){
		return (float)(a/b);
	}
	
	public void test(int a, int b) {
		System.out.println("a : " + a + "b : "+b);
	}
}
