package com.java0425;

import java.util.Scanner;

public class Test {
	
	public Test() {
		System.out.println("평가를 시작 하겠습니다.");
		Student(); //첫 실행
	}
	
	Scanner sc = new Scanner(System.in);
	int num = 1;
	int input = 0;
	String score = "";

	public void Student() {
			
		System.out.print(num + "번학생의 시험 점수를 입력하세요 : ");
		input = sc.nextInt();
		
		if(input == 100 || input >=90) {
			score = "A";
		}
		else if(input ==89 || input >=80) {
			score = "B";
		}
		else if(input ==79 || input >=70) {
			score = "C";
		}
		else if(input ==69 || input >=60) {
			score = "D";
		}
		else {
			score = "F";
		}
		
		System.out.println(num + "번학생의 시험 결과는 "+score+"입니다.");
		num++;
		
		// 재귀 함수를 이용한다. ( 10번 반복 )
		if(num >= 10) {
			System.out.println("평가가 종료 되었습니다.");
			return;
		}
		else {
			// 자기 자신을 다시 호출한다. (재귀)
			Student();
		}
		
		
		
	}
}

