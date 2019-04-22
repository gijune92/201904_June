package com.java0422;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("변수 시작!");
		
		/*
			String str1 = "";	//선언과 대입을 같이 	( 이 변수를 상수로 사용할 때 많이 사용하는 방법.)
			String str2;		//변수 만들기 
			str2 ="";			//변수에 값을 대입한다. ( 변수를 만들때 많이 사용 )
		*/
		
		String str = "Hello world";			//변수 선언과 대입을 동시에 이루어진것.
		System.out.println(str);			//변수 출력...
		
		str = "문자열 변경";					// 값 변경
		System.out.println(str);			// 변수 사용
		
		str = "1234"; 						// 연산
		System.out.println(str);
		
		int var = 1;						// 정수형
		System.out.println(var);
		
		String res = str + var;
		System.out.println(res); //		
		
	}
}
