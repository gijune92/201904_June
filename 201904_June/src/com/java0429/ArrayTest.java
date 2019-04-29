package com.java0429;

import java.util.Scanner;

public class ArrayTest {

	public void t1() {
		boolean a[][] = new boolean[5][5];
		
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(i % 2 == 0) {
					a[i][j] = false;
				}
				else
					a[i][j] = true;
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++){
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void t2() {
		int a[][] = new int[5][5];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(i % 2 == 0) {
					a[i][j] = 0;
				}
				else {
					a[i][j] = 1;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void t3() {
		String a[][] = new String [5][5];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(i+j == 4 || i-j ==0) {
					a[i][j] = "■";
				}
				else
					a[i][j] = "□";
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
	public void test() {
		
		String[][] map = new String[10][10];
		
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				if(i % 9 ==0 || j % 9 == 0 ) {
					map[i][j] = "■";
				}
				else
					map[i][j] = "□";
			}
		}
		
		map[2][2] = "■"; map[2][3] = "■"; map[2][5] = "■"; map[2][7] = "■";
		map[3][2] = "■"; map[3][3] = "■"; map[3][5] = "■"; map[3][7] = "■";
		map[4][3] = "■"; map[4][4] = "■"; map[4][5] = "■"; map[4][7] = "■";
		map[5][3] = "■"; map[5][4] = "■"; map[5][5] = "■"; 
		map[6][2] = "■"; map[6][3] = "■"; map[6][4] = "■"; map[6][5] = "■"; map[6][7] = "■";
		map[7][2] = "■"; map[7][3] = "■"; map[7][5] = "■"; map[7][7] = "■";
		map[8][7] = "■";
		
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + "");
			}
			System.out.println();
		}
	}
	/*
	//public void t5(int pX, int pY, int bX, int bY) {
	public boolean t4(int pX, int pY, int bX, int bY) {
		boolean res = false;
		int[][] map = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,1,1,1,1,1,1,1,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,1,0,0,0,1,0,1,0},
				{0,1,1,0,0,0,1,1,1,0},
				{0,1,0,0,0,0,1,0,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,1,1,1,1,1,0,1,0},
				{0,0,0,0,0,0,0,0,0,0},
		};
		
		for(int i = 0; i < map.length; i++) {
			for(int j =0; j < map[i].length; j++){
				
				if(map[pX][pY] == 0) {
					pX = bX;
					pY = bY;
					res = false;
				}
				
				if( i == pX && j == pY)
					System.out.print(" ＠ ");
				else if(map[i][j] == 1)
					System.out.print(" □ ");
				else
					System.out.print(" ■ ");
				
			}
			System.out.println();
		}
		return res;
	}

	public void t5() {
		Scanner scan  = new Scanner(System.in);
		int pX = 1; 
		int pY = 1; 
		int bX = 1;
		int bY = 1;
		
		t4(pX, pY, bX, bY);
		
		while(true) {
			String input = scan.next();
			switch( input.toUpperCase() ) {
			case "W" : // ↑
				
				pX--;
				break;
			case "S" : // ↓
				pX++;
				break;
			case "A" : // ←
				pY--;
				break;
			case "D" : // →
				pY++;
				break;
		
			default : 
				break;
			}
			if(t4(pX, pY, bX, bY)){
				pX = bX;
				pY = bY;
			}else {
				bX = pX;
				bY = pY;
			}
				
			
		}
	}
	*/
	
	/*
	 * t4(전 X좌표, 전 Y좌표, 후 X좌표, 후 Y좌표) 
	 * 1. 출력
	 * 2. ㉿ 이동
	 * 3. 결과 
	 * t5() -> t4를 반복시키는 역활
	 * 8,8에 도달했을때는 종료.
	 * 상, 하, 좌, 우  제어
	 */
	public boolean t4(int aX, int aY, int bX, int bY) {
		boolean result = false;
		int[][] 맵 = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,1,1,1,1,1,1,1,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,1,0,0,0,1,0,1,0},
				{0,1,1,0,0,0,1,1,1,0},
				{0,1,0,0,0,0,1,0,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,1,1,1,1,1,0,1,0},
				{0,0,0,0,0,0,0,0,0,0}
		};
		for(int y = 0; y < 맵.length; y++) { // 행
			for(int x = 0; x < 맵[y].length; x++) { // 열
				if(맵[aY][aX] == 0) {
					aY = bY; 
					aX = bX;
					result = true;
				}
				if(y == aY && x == aX) {
					System.out.print(" ㉿ ");
				} else if(맵[y][x] == 1) {
					System.out.print(" □ ");
				} else {
					System.out.print(" ■ ");
				}
			}
			System.out.println();
		}
		return result;
	}
	
	public void t5() {
		Scanner scan = new Scanner(System.in);
		int aX = 1;
		int aY = 1;
		int bX = 1;
		int bY = 1;
		t4(aX, aY, bX, bY); // 시작을 위하여 필요한 호출 부분
		while(true) {
			String input = scan.next();

			
			switch (input.toUpperCase()) {
				case "W": // 위쪽
					aY--;
					break;
				case "S": // 아래쪽
					aY++;
					break;
				case "A": // 왼쪽
					aX--;
					break;
				case "D": // 오른쪽
					aX++;
					break;
				default:
					break;
			}
			System.out.println(aY + ", " + aX + ", " + bY + ", " + bX);
			if(t4(aX, aY, bX, bY)) { // 이동을 위하여 호출 부분
				aX = bX;
				aY = bY;
			} else {
				bX = aX;
				bY = aY;
			}
			
			if(aX == 8 && aY == 8 ) {
				System.out.println("끄읕~~~~~~~~~~~~~~~~~~~~~~~");
				scan.close();
				break;				
			}

			
		}
	}
}
