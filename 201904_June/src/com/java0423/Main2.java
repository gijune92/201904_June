package com.java0423;

public class Main2 {

	public void main(String[] args) {
		System.out.println("특수 문자 출력");
		/*
		 * 특수문자 
		 * \n -> 한줄 이동 
		 * \' -> ' > 문자를 정의 할 때, : ''
		 * \uD64D : Unicode 홍
		 */
		System.out.println("\\\\");
		
		char a = 92;
		System.out.println(a);

		System.out.println(Character.toString(0x5C));
		System.out.println("출력결과 : \u005C\u005C");
		
	}

}
