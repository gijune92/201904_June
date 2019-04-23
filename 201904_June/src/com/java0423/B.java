package com.java0423;

public class B {
	
	// 기본 생성자는 사용자가 생성자를 임의로 생성(정의) 하게 된다면, 기본 생성자가 만들어지지 않고, 사용자가 만든 생성자가 Default가 된다.
	
	public B(String msg) {
		System.out.println("A : " + msg);
		new A("안녕~?");
	} // 기본 생성자
}
