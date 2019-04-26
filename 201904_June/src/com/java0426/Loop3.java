package com.java0426;

import java.util.Scanner;

public class Loop3 {
	/*
	 * while < - > for의 차이점.
	 * while문은 좀 더 간략하게 코드가 보일 수 있다.
	 * for문은 코드가 직관적으로 보이게 된다.
	 * 
	 * 무언가 알람이 올 때까지 대기하는 기능을 이용할 때.
	 * ----------------------------------------
	 * do {
	 * 
	 * }while (조건식)
	 * 
	 * -> 최초 한번은 무조건 실행한다.
	 * 
	 * ----------------------------------------
	 */
	public void w_loop1() {
		while(true) {
			// true일 경우에는 무한루프
			System.out.println("무한루프");
		}
	}
	public void w_loop2() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("입력 하세요>>");
			String str = sc.next();
			if("exit".equals(str)) {
				break;
			}
			// true일 경우에는 무한루프
			System.out.println("무한루프");
		}
		System.out.println("while 종료");
		sc.close();
	}
	
	public void w_loop3() {
		int count = 0;
		
		while(count < 100) {
			System.out.println(count);
			count++;
			
		}
		System.out.println("count : " + count);
	}
}
