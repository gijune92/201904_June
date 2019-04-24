package com.java0424;

public class Main {
	
	/*
	 * 1.생성자
	 * 생성자 내에, 생성자 및 메소드를 생성하지 않는다.
	 * 
	 * 2. 변수, 상수 - 전역
	 * 
	 * 3. 메소드 > 변수(메소드 내에서 사용하는)
	 * 메소드 내에, 메소드, 생성자를 정의할 수 없다.
	 * 
	 * 4. static - static은 main Method외 사용하지 않는다. ( 메모리의 낭비가 심해...)
	 * 
	 * 5. 기능 구현시, 가능하면 클래스를 적극 활용한다. (모듈화 // 재사용성을 위해 나눠서 만든다.)
	 * 
	 * 
	 */
	

	public void main(String[] args) {
		System.out.println("");
		Calc c = new Calc();
		int a = 20;
		int b = 10;
		
		int ires = 0;
		float fres = 0f;
		
		ires = c.plus(a, b);
		ires = c.minus(a, b);
		fres = c.multiful(a, b);
		fres = c.division(a, b);
		
	}

}
