package com.java0424;

public class StudyQuestion {
	
	public void Question1(int i_num) {
		if(i_num > 0)
			System.out.println("결과는 : Plus 입니다.");
		else if(i_num < 0)
			System.out.println("결과는 : Minus 입니다.");
		else
			System.out.println("결과는 : 0 입니다.");
	}
	
	public void Question2(int i_num) {
		if(i_num >=90)
			System.out.println("시험 결과는 : A 입니다.");
		else if(i_num >=80)
			System.out.println("시험 결과는 : B 입니다.");
		else if(i_num >=70)
			System.out.println("시험 결과는 : C 입니다.");
		else if(i_num >=60)
			System.out.println("시험 결과는 : D 입니다.");
		else
			System.out.println("시험 결과는 : F 입니다.");
	}
	public void Question2_1(int i_num, int score) {
		if(score >=90)
			System.out.println(i_num+"번학생의 시험 결과는 A 입니다.");
		else if(score >=80)
			System.out.println(i_num+"번학생의 시험 결과는 B 입니다.");
		else if(score >=70)
			System.out.println(i_num+"번학생의 시험 결과는 C 입니다.");
		else if(score >=60)
			System.out.println(i_num+"번학생의 시험 결과는 D 입니다.");
		else
			System.out.println(i_num+"번학생의 시험 결과는 F 입니다.");
	}
	public void Question3(int num1, int num2, int num3)
	{
		// 3, 2, 1
		if(num1 > num2) {
			if(num1 > num3)
				if(num3 > num2)
					System.out.println("정렬한 결과는 : " + num1+"," + num3+ "," + num2);
				else
					System.out.println("정렬한 결과는 : " + num1+"," + num2+ "," + num3);
			else
				System.out.println("정렬한 결과는 : " + num3+"," + num1+ "," + num2);
		}
		else if(num2 > num3) {
			if(num1 > num3)
				System.out.println("정렬한 결과는 : " + num2+"," + num1+ "," + num3);
			else
				System.out.println("정렬한 결과는 : " + num2+"," + num3+ "," + num1);
		}
		else if(num3>num1) {
			System.out.println("정렬한 결과는 : " + num3+"," + num2+ "," + num1);
		}
	}
	public void Question4(int i_num) {
		if(i_num>50 && i_num<=70 || i_num % 6 ==0)
			System.out.println("WIN");
		else
			System.out.println("LOSE");
	}
	public String Question5(int num1, int num2, int num3) {
		String str = "CRASH";
		if(num1 < 170)
			return str +" "+ num1;
		else if(num2 < 170)
			return str +" "+ num2;
		else
			return str +" "+ num3;
	}
	
	
}
