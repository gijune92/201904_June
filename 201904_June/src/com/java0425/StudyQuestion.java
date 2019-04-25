package com.java0425;

public class StudyQuestion {

	public void level1() {
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9; j++) {
				if(j == 1) {
					System.out.println(i+"단");
				}
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println("");
		}
	}//10
	
	public void level2() {
		for(int i = 1; i<=7; i+=3) {
			System.out.println(i+"단 \t\t" + (i+1) +"단\t\t" + (i+2) + "단 ");
			for(int j = 1; j <= 9; j++) {
				for(int k = 0; k <= 2; k++) {
					System.out.print((i+k) + " * " + (j) +" = " + ((i+k)*(j)) + " \t" );
				}
				System.out.println("");
			}
		}
	} //12
	
	
	public void level3() {
		for(int i = 1; i<=3; i++) {
			System.out.println(i+"단 \t\t" + (i+3) +"단\t\t" + (i+6) + "단");
			for(int j = 1; j <= 9; j++) {
				for(int k = 0; k <= 6; k+=3) {
					System.out.print((i+k) + " * " + (j) +" = " + ((i+k)*(j)) + " \t" );
				}
				System.out.println("");
			}
		}
	} //12
	
	// X ㅁ + -> 합친 모양 찍기
	public void level4(int size) {
		for(int i = 0; i < size; i++) {
			/* 
			 * i == j -> \
			 * i % 4 ==0 -> --------
			 * j % 4 == 0 |
			 * i + j == 8 /
			 */
			for(int j = 0; j < size; j++) {
				if(i == j || i % (size / 2) == 0 || j % (size / 2) ==0 || i + j == (size-1)) {
					System.out.print(" ■ ");
				}
				else {
					System.out.print(" □ ");	
				}
			}
			System.out.println("");
		}
	}
	public void level5() {
		for(int i = 0; i <= 8; i++) {
			for(int j = 0; j <= 8; j++) {
				if(i % 4 == 0 || j% 4 ==0 || i+j == 4 || (i+4)==j) {
					System.out.print(" ■ ");
				}
				else {
					System.out.print(" □ ");	
				}
			}
			System.out.println("");
		}
	}
	
	

}
