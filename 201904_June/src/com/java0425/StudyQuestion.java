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
				for(int k = 0; k <= 7; k+=3) {
					System.out.print((i+k) + " * " + (j) +" = " + ((i+k)*(j)) + " \t" );
				}
				System.out.println("");
			}
		}
	} //12
	
	public void level4() {
		int count = 0;
		
		for(int i = 0; i < 5; i++) {
			/*
			if(count > 4) {
				count = count -2;
			}
			
			*/
			for(int j = 0; j < 9; j++) {
				if(i==j || i % 8 ==0 || j % 8 ==0 || j == 4 ) {
					System.out.print(" ■ ");
				}
				else {
					System.out.print(" □ ");	
				}
			}
			/*
			for(int j = 0; j < count; j++) {
				if(i==j || i % 4 ==0 || j % 4 ==0) {
					System.out.print(" ■ ");
				}
				else {
					System.out.print(" □ ");	
				}
			}
			count++;*/
			
			System.out.println("");
		}
		
	}
	//System.out.print(" □ ");
	
	
	
	/*
	 if(j_count >= i &&)
	{
		System.out.print("X");
	}
	  
	  				if(i % 5 == 0) {
					System.out.print("O");
				}
				if(j ==10) {
					System.out.print("O");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
			사선
	 */
	
	
	
	/*
	 * 하드코딩
	if(i==j || i % 6 ==0 || j % 6 ==0) {
		System.out.print(" □ ");
	}
	else {
		System.out.print(" ■ ");	
	}
	
	if()
	{
		System.out.print(" □ ");
	}
	else {
		System.out.print(" ■ ");	
	}
	*/
	
	

}
