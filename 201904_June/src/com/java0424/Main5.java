package com.java0424;

import java.util.Scanner;

public class Main5 {

	public void main(String[] args) {

		StudyQuestion sq = new StudyQuestion();
		Scanner sc = new Scanner(System.in);
		
		int i_num = 0;
		/*
		System.out.print("정수를 입력하세요 : ");
		i_num = sc.nextInt();
		sq.Question1(i_num);
		
		System.out.print("시험 점수를 입력하세요 : ");
		i_num=sc.nextInt();
		sq.Question2(i_num);
		*/
		
		
		int num1, num2, num3;
		/*
		System.out.print("첫 번재 숫자를 입력하세요.");
		num1 = sc.nextInt();
		System.out.print("두 번재 숫자를 입력하세요.");
		num2 = sc.nextInt();
		System.out.print("세 번재 숫자를 입력하세요.");
		num3 = sc.nextInt();
		
		sq.Question3(num1, num2, num3);
		
		
		System.out.print("공의 위치를 입력하세요 : ");
		i_num = sc.nextInt();
		sq.Question4(i_num);
		
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		System.out.println(sq.Question5(num1, num2, num3));
		*/
		
		/*
		//Q2-1.
		for(int i = 1; i <= 10; i++) {
			int score = 0;
			System.out.print(i+"번학생의 시험 점수를 입력하세요 : ");
			score = sc.nextInt();
			sq.Question2_1(i, score);
		}
		*/
		
		//Q2-1 수정
		sq.Question2_2();
		
		sc.close();
	}

}
