package com.java0424;

public class Conditional {
	/*
	 * if(조건식){}
	 * else {}
	 * else if(조건식){}
	 * ( A 비교연산자 B )
	 *  == (같다)  =! (같지 않다)  > (크다) < (작다) >= (크거나 같다) <= (작거나 같다)
	 *  문자열을 비교 할 때에는, .equls() 사용
	 *  
	 *  switch(변수){
	 *  	case 값 1 : 비교값과 같을 경우 실행
	 * 			break;
	 * 		case 값2 : 
	 * 			break;
	 * 		default : 비교값과 같은 경우가 없을 때 실행
	 * }
	 */
	
	
	public void t1(int a) {
		if(10 == a) {
			System.out.println("같다");
		}
		else
			System.out.println("같지 않다.");
	}
	public boolean t2(int a) {
		if(10 == a) {
			return true;
		}
		else
			return false;
	}
	public int t3 (int a, int b) {
		if(a == b){
			return 1;
		}
		else
			return 0;
	}
	public int t4 (int a, int b) {
		if(a > b) {
			return a;
		}
		else if(a < b) {
			return b;
		}
		else
			return -1;
	}
	public String t5 (int a, int b) {
		if(a == b) {
			return "두 개의 값이 같다.";
		}
		else if(a != b) {
			return "두 개의 값이 같지 않다.";
		}
		else if(a > b) {
			return "A의 값이 크다.";
		}
		else if(a<b) {
			return "B의 값이 크다.";
		}
		else if(a>=b) {
			return "A 변수의 값이 B보다 크거나 같다.";
		}
		else if(a<=b) {
			return "A 변수의 값이 B보다 작거나 같다.";
		}
		else
			return "두개의 값을 비교 할 수 없다.";
			
	}
	public String t6 (int a, int b) {
		if(a==b) {
			return "두개의 값이 같다.";
		}
		if(a != b) {
			return "두 개의 값이 같지 않다.";
		}
		if(a>b) {
			return "A의 값이 크다.";
		}
		if(a<b) {
			return "B의 값이 크다.";
		}
		
		return "두개의 값을 비교 할 수 없다.";
	}

	public String t7 (int a, int b) {
		String msg ="";
		if(a==b) {
			msg = "두개의 값이 같다.";
		}
		if(a != b) {
			msg = "두 개의 값이 같지 않다.";
		}
		if(a>b) {
			msg = "A의 값이 크다.";
		}
		if(a<b) {
			msg = "B의 값이 크다.";
		}
		return msg;
	}
	
	public String t8(int a) {
		String msg="";
		switch(a) {
		case 0:
			msg = "전달 받은 값은 0 입니다.";
			break;
		default:
			msg = "전달 받은 값은 case 값에 없다.";
			break;
		}
		return msg;
	}
	// 조합형 키조합을 구현시 사용할수도 있다..
	public String t9(int a) {
		String msg = "";
		
		switch(a) {
		case 0:
			msg = msg +"0비교";
		case 1:
			msg = msg +"1비교";
		case 2:
			msg = msg +"2비교 범위의 값 입니다.";
			break;
		default:
			msg ="0~2 범위의 값이 아닙니다.";
			break;
		}
		
		return msg;
		
	}
	
	public String t10(int score) {
		String grade = "";
		
		switch(score/10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade ="B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default :
			grade = "F";
			break;
		}
		
		return grade;
	}
	
	
	
}
