package com.java0423;

public class Main {

	public void main(String[] args) {
		
		System.out.println("변수 연습");
		/*
		 * 0. 객체 (object > class)
		 * 1. 변수 
		 * 2. 메소드
		 * 3. 출력
		 * 4. 연산			 - *  /  % 
		 * 5. 접근제한자
		 * 6. 정적(static)
		 * 7. 리턴타입(void)
		 * 8. 자료형
		 * 9. 매계변수 (메소드 호출 시, 전달 값)
		 */

		Var v = new Var();	//객체 생성   [ 객체(class) 객체변수명  생성키워드 객체 생성자 ] 
		v.var();			
		
		//Var.var();
		/*
		 * 정적 메소드!!!
		 * void var(){} 이것을 
		 * static void var(){} 요렇게 바꾸면 된답니다. static을 붙여서 정적메소드로 바꾼다
		 * 메모리의 낭비가 심하니 쓰지맙시다!
		 */
		
		//new Var();
		/*
		 * 객체를 생성할 때, 바로 실행이 되게끔 만들수 있는 코드 
		 * 기본 생성자 내에, 호출할수 있는 코드를 넣어두면 된다.
		 */
		
		v.var2(1,5);
		
	}

}
