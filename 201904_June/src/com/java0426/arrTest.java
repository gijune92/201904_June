package com.java0426;

import java.util.Scanner;

public class arrTest {

	public void t1() {
		
		int a;			// 변수 선언
		
		int[] array;	// 배열 선언
		
		a = 1;
		//array = 1;		// XXXXXX
		
		array = new int[5];	// 초기화! ( 배열은 사용하기 위해 무조건 초기화를 시켜줘야 한다. )
		array[2] = 1;
		
		int[] bb = new int[2];
		bb[0] = 0;
		bb[1] = 1;
		
		System.out.println(a);
		System.out.println(array);
		System.out.println(bb);
		
		System.out.println(array[2]);
		System.out.println(bb[0]);
		System.out.println(bb[1]);
		
	}
	
	public void t2() {
		int[] one = new int [9];
		one[0] = (1*1);
		one[1] = (1*2);
		one[2] = (1*3);
		one[3] = (1*4);
		one[4] = (1*5);
		one[5] = (1*6);
		one[6] = (1*7);
		one[7] = (1*8);
		one[8] = (1*9);
		// [1, 2, 3, 4, 5, 6, 7, 8, 9]
		//  0  1  2  3  4  5  6  7  8 << 위치값 (인덱스)
		
		System.out.println("1 * 5 = " + one[4]);
	}
	
	public void t3() {
		int[] dan = new int [9];
		for( int i = 1; i <= 9; i++ ) { // 정수 배열에 값을 담는 반복문 실행.
			int var = ( 1 * i );
			int index = (i-1); // 0~8 Array_index
			dan[index] = var;
		}
		
		for(int i = 0; i < dan.length; i++) {
			int number = (i+1);
			System.out.println(" 1 * " + number +" = "+dan[i]);
		}
	}
	
	public void t4() {
		String[] strArray = new String[7];
		
		strArray[0] = "일";
		strArray[1] = "월";
		strArray[2] = "화";
		strArray[3] = "수";
		strArray[4] = "목";
		strArray[5] = "금";
		strArray[6] = "토";
		
		// 일 화 목 토  순으로 출력
		for(int i = 0; i < strArray.length; i+=2) {
			System.out.println(strArray[i]);
		}
		
		for(int i = 0; i < strArray.length; i++) {
			if(i % 2 ==0)
				System.out.println(strArray[i]);
		}
	}

	public void t5() {
		int[][] bingo = new int[5][5];
		bingo[0][0] = 5;
		
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++ ) {
				System.out.print(bingo[i][j]);
			}
			System.out.println();
		}
	}

	public void t6() {
		String[][] day_Array = new String[7][5];
		String[] day = new String[7];
		// 1. 현재 달의 달력 데이터를 day_Array 데이터를 담아라
		// 2. 출력 오늘 요일을 표현 할것.
		
		
		day[0] = "월";
		day[1] = "화";
		day[2] = "수";
		day[3] = "목";
		day[4] = "금";
		day[5] = "토";
		day[6] = "일";
		
		
		int day_count = 1;
		
		for (int i = 0; i < day_Array[0].length; i++){
			System.out.println(day_count);
			for(int j = 0; j < day_Array.length; j++) {
				if(day_count <= 30){
					day_Array[j][i] = day[j];
					day_count++;
				}
				else
					break;
			}
		}
				
		
		for (int i = 0; i < day_Array.length; i++) {
			for(int j = 0; j < day_Array[i].length; j++) {
				System.out.print(day_Array[i][j] + " " );
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일을 입력하세요(1~30) : ");
		int var = sc.nextInt();
		
		System.out.println(var);
		
		day_count = 1;
		for (int i = 0; i < day_Array[0].length; i++){
			for(int j = 0; j < day_Array.length; j++) {
				if(day_count == var){
					System.out.println("4월 "+var+"일은 "+day_Array[j][i]+ "요일 입니다.");
					day_count++;
					break;
				}
				else
				day_count++;
			}
			if(day_count == (var)){
				System.out.println("여기 들려야해");
				break;
			}
		}
		System.out.println(day_count);
		
		sc.close();
	}
}
