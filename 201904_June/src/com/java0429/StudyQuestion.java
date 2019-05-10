package com.java0429;

import java.util.Scanner;

public class StudyQuestion {
	int Count = 0;
	int Game_flag = 0;
	
	public boolean Routine(int aX, int aY, int bX, int bY) {
		Game_flag = 0;
		boolean res= false;
		int Map[][] = {
				{0,0,0,0,0,0,0},
				{0,1,1,1,1,1,0},
				{0,1,0,3,0,1,0},
				{0,1,1,0,1,1,0},
				{0,0,1,1,1,0,0},
				{0,0,0,0,1,1,0},
				{0,0,0,0,0,0,0}
		};
		
		for(int y = 0; y < Map.length; y++) { // 행
			for(int x = 0; x < Map[y].length; x++) { // 열
				if(Map[aY][aX] == 0) {
					aY = bY; 
					aX = bX;
					Game_flag = 1;
					res = true;
					
				}
				else if(Map[aY][aX] == 3) {
					aY = 1;
					aX = 1;
					bX = 1;
					bY = 1;
					Count = 0;
					Game_flag = 2;
					res = true;
					
				}
				
				if(y == aY && x == aX) {
					System.out.print(" ㉿ ");
				} else if(Map[y][x] == 1) {
					System.out.print(" □ ");
				} else if(Map[y][x] == 3) {
					System.out.print(" ▒ ");	
				} else {
					System.out.print(" ■ ");
				}
			}
			System.out.println();
		}
		return res;
	}
	
	public void Loop_Game() {
		Scanner scan = new Scanner(System.in);
		int aX = 1;
		int aY = 1;
		int bX = 1;
		int bY = 1;
		boolean res ;
		Routine(aX, aY, bX, bY); // 시작을 위하여 필요한 호출 부분
		
		while(true) {
			String input = scan.next();
			Count++;
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
			 res = Routine(aX, aY, bX, bY);
			if(Game_flag == 1) { // 이동을 위하여 호출 부분
				aX = bX;
				aY = bY;
				System.out.println("이동할 수 없는 위치 입니다.");
			}else if(Game_flag ==2) {
				aX = 1;
				aY = 1;
				bX = 1;
				bY = 1;
				System.out.println("장애물을 만나, 처음으로 돌아 갑니다.");
			}else {
				bX = aX;
				bY = aY;
			}
			
			// 종료 부분!
			if((aX == 5 && aY == 5) && Count== 8 ) {
				System.out.println("최단 거리로 이동 하였습니다. 이동 횟수 : "+ Count);
				break;
				
			}else if((aX ==5 && aY ==5) && Count > 8) {
				System.out.println("최단거리가 아닙니다. 현재 이동 횟수 : " + Count);
				Count = 0;
				Loop_Game();
			}
			
		}
	}
}