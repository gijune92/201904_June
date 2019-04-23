package com.java0423;

public class Var {
	
	public Var() {
		//var();
	} //  기본 생성자 ( 생략 가능 ) 이 안에서 메서드 호출 코드를 넣어두면, new Var(); 이런식으로 호출을 한다면, 생성시 var()함수가 바로 실행이된다. 
	// return type이 없으면 생성자 라고 생각해도 괜찮
	
	public int state1;
	protected int state2;
	int state3 ;
	private int state4;
	
	
//  접근제한자 리턴타입 함수명(매개변수) 	
	public void var() {
// public static void var(){}  -> 정적 메소드		
		/*
		 * 변수 사용법
		 * 1. 변수 선언
		 * 2. 변수 데이터 타입 대입(변수 초기화?)
		 * 3. 변수 사용
		 * 변수에 변수를 담을 때 는, 값이 같은게 아니라, 먼저 선언된 변수의 메모리 주소값을 같이 가지는 것이다.
		 * 같은 값을 가진 변수로 보이지만, 메모리 구조를 생각하자.
		 */
		
		int a;					// 1.
		a = 1;					// 2.
		//System.out.println(a);	// 3.
		
		int b = 2;				// 1,2
		//System.out.println(b);	// 3.
		
		int f;
		
		f =a;
		//System.out.println(f);			// 1
		
		a =10;
		
		//System.out.println(a);			// 10
		//System.out.println(f);			// 1? 10?
		
		// Collection을 적용할 때에는, 주소값까지 공유되기 때문에, a의 값으로 될거다.
	}

	public void var2(int a, int b) {
		System.out.println(a+b);
	}
}
