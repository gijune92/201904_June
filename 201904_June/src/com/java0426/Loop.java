package com.java0426;

import java.util.Scanner;

public class Loop {
	public void lv1() {
		// 1~9단을 순차적으로 출력해라.
		for(int x = 1; x <= 9; x++) {
			System.out.println(x + "단");
			for(int y = 1; y <= 9; y++) {
				// 1*1=1
				System.out.println(x + " * " + y + " = " + (x*y) );
			}
			System.out.println("");
		}
	}
	
	public void lv2() {
		/* 1, 2, 3
		 * 4, 5, 6
		 * 7, 8, 9
		 * 위와 같은 순으로 구구단을 출력 시켜라.
		 */
		for(int x = 1; x <= 9; x+=3) {
			System.out.print(x + "단 \t\t");
			System.out.print((x+1) + "단 \t\t");
			System.out.print((x+2) + "단 \n");
			for(int y = 1; y <= 9; y++) {
				// 1*1=1
				System.out.print(x + " * " + y + " = " + (x*y) + " \t" );
				System.out.print((x+1) + " * " + y + " = " + (x*y) + " \t" );
				System.out.print((x+2)+ " * " + y + " = " + (x*y) +"\n");
			}
			System.out.println("");
		}
	}
	public void lv3() {
		/* 1, 4, 7
		 * 2, 5, 8
		 * 3, 6, 9
		 * 위와 같은 순으로 구구단을 출력 시켜라.
		 */
		for(int x = 1; x <= 3; x++) {
			System.out.print(x + "단 \t\t");
			System.out.print((x+3) + "단 \t\t");
			System.out.print((x+6) + "단 \n");
			for(int y = 1; y <= 9; y++) {
				// 1*1=1
				System.out.print(x + " * " + y + " = " + (x*y) + " \t" );
				System.out.print((x+3) + " * " + y + " = " + ((x+3)*y) + " \t" );
				System.out.print((x+6)+ " * " + y + " = " + ((x+6)*y) +"\n");
			}
			System.out.println("");
		}
	}
	public void lv4() {
		Scanner sc = new Scanner(System.in);

		// x축으로 출력나올 갯수를 입력 받는다.
		System.out.print("X축으로 출력 나올 갯수를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int x = 1; x <= 9; x+=num) { // 1~9단
			for(int y = 1; y <= 9; y++) { // 곱할수 y(1~9)
				for(int j =0; j< num; j++) { // 몇개식 표현할지. X축
					System.out.print((x+j) + " * " + y + " = " + ((x+j)*y) + " \t" );
				}
				System.out.println();
			}
			System.out.println();
		}
		
		sc.close();
	}
	public void lv5() {
		Scanner sc = new Scanner(System.in);

		// x축으로 출력나올 갯수를 입력 받는다.
		// y축으로 출력나올 갯수를 입력 받는다.
		// 1~9단 까지만 출력될 수 있도록 한다.
		
		System.out.print("X축으로 출력 나올 갯수를 입력하세요 : ");
		int x_num = sc.nextInt();
		
		System.out.print("Y축으로 출력 나올 갯수를 입력하세요 : ");
		int y_num = sc.nextInt();
		
		for(int x = 1; x <= (y_num*x_num); x+=x_num) { // 1~9단
			for(int y = 1; y <= 9; y++) { // 곱할수 (1~9)
				for(int j =0; j< x_num; j++) { // 몇개식 표현할지. X축
					if(x+j > 9) // 9단까지만 출력되게끔
					{
						break;
					}
					System.out.print((x+j) + " * " + y + " = " + ((x+j)*y) + " \t" );
				}

				System.out.println();
			}
			System.out.println();
		}
		
		sc.close();
	}
	public void level5() {
		Scanner scan = new Scanner(System.in);
		System.out.println("X축으로 출력 나올 갯수를 입력 하세요.");
		int x축 = scan.nextInt();
		System.out.println("Y축으로 출력 나올 갯수를 입력 하세요.");
		int Y축 = scan.nextInt();
		/****************************************************
		 * x축과 y축의 값을 입력 받아 출력하기 단, 출력은 9단까지 표현할것.
		 ****************************************************/
		for(int y = 1; y <= (Y축 * x축); y = y + x축) {
			for(int x = 1; x <= 9; x++) {
				for(int 계산 = 0; 계산 < x축; 계산++) {
					if((y + 계산) > 9) {
						break;
					}
					System.out.print((y + 계산) + " * " + x + " = " + ((y + 계산) * x) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		scan.close();
	}
}
