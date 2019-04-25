package com.java0425;

public class For1 {

	/*
	 * for문 for( 1, 2, 3){실행문}
	 * 1. 초기화식 : for문에서 사용할 변수 선언 및 초기값 정의
	 * 2. 조건식 : 조건이 False 값이 될 때까지, 반복
	 * 3. 증감식 : 초기화 식에 사용하는 변수의 변화를 주기 위한 식
	 */
	
	public void for1() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i); // 0 ~ 9 까지 출력
		}
	}
	
	public void for2(int s) {
		System.out.println("for2 시작");
		for(int i = 0; i < s; i++) {
			System.out.println(i);
		}
		System.out.println("for2 종료");
	}
	
	public void for3(int a, int b) {
		System.out.println("for3 시작");
		for(; a < b; a++) {
			System.out.println(a);
		}
		System.out.println("for3 종료");
	}
	
	public void for4() { // 0 ~ 4
		for(int i = 0; i < 5; i++) {
			if(i%2==0)
				System.out.print("★");
			else
				System.out.print("☆");
			
			System.out.println("");
		}
	}
	public void for5() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				// j = 0, j = 0 >> ★
				// j = 0, i = 1 >> ★ || j = 1, i = 1 >> ☆ || >> ★☆
				// j = 0, i = 1 >> ★ || j = 1, i = 1 >> ☆ || >> j = 2, i = 1 >> ★ ||★☆★
				// j = 0, i = 1 >> ★ || j = 1, i = 1 >> ☆ || >> j = 2, i = 1 >> ★ || j = 3, i = 1 >> ☆ ||★☆★☆ 
				if(j % 2==0)
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println("");
		}
	}
	
	public void for6() {
		/*
		for(int i = 0; i <5; i++) {
			if(i % 2 == 0)
			{
				for(int j = 0; j <= i; j++) {
					if(j % 2 == 0)
						System.out.print("★");
					else
						System.out.print("☆");
				}
			}
			else
			{
				for(int j = 0; j <= i; j++) {
					if(j % 2 != 0)
						System.out.print("★");
					else
						System.out.print("☆");
				}
			}
			System.out.println("");
		}
		*/
		for(int i =0; i<5; i++) {
			for(int j = 0; j<= i; j++) {
				if((i-j) %2 ==0) {
					System.out.print("★");
				}else {
					System.out.print("☆");
				}
			}
			System.out.println("");
		}
	}
	
	public void for7() {
		int t= 0;
		for(int i = 0; i < 9; i++) { // 0, 1, 2, 3, 4, 3, 2, 1, 0
			if( i > 4){
				t = t-2;
			}
			for(int j = 0; j <= t; j++) {
				if(j % 2==0)
					System.out.print("★");
				else
					System.out.print("☆");
			}
			t++;
			System.out.println("");
		}
	}
	
	public void for8() {
		int t= 0;
		for(int i = 0; i < 9; i++) { // 0, 1, 2, 3, 4, 3, 2, 1, 0
			if( i > 4){
				t = t-2;
			}
			for(int j = 0; j <= t; j++) {
				if((i-j) %2 ==0) 
					System.out.print("★");
				else
					System.out.print("☆");
			}
			t++;
			System.out.println("");
		}
	}
	
	public void test1() {
				
		for(int i =0; i<5; i++){
			for(int j = 0; j<5; j++){
				System.out.print("★");
			}
			System.out.println("");
		}
	}
	
	public void test2() {
		for(int i = 0; i < 5; i++) { // 행
			for(int j =0; j <= i; j++) { // 열
				System.out.print("★");
			}
			System.out.println("");
		}
	}
	
	public void test3() {
		for(int i = 0; i < 5; i++) {	//행
			for(int j = 5; j > i ; j--) {	//열
				System.out.print("★");
			}
			System.out.println("");
		}
	}
	
	public void test4() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j < i) {
					System.out.print("☆");
				}
				else {
					System.out.print("★");
				}
			}
			System.out.println("");
		}
	}
	
	public void test5() {
		for(int i = 0; i < 5; i++) {
			//for(int j = 0; j < 5; j++) {
			for(int j = 5; j > i ; j--) {	//열
				if(j > i) {
					System.out.print("☆");
				}
				else {
					System.out.print("★");
				}
			}
			System.out.println("");
		}
	}
		
}
