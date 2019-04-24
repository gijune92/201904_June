package com.java0424;

public class IfEx {
	public void ifex1(int score){
		if(score >=60)
			System.out.println("[IfEx1] - 합격을 축하합니다.");
	}
	public void ifex2(int score) {
		if(score >= 60)
			System.out.println("[IfEx2] - 합격을 축하합니다.");
		else
			System.out.println("[IfEx2] - 다음에 다시오세요.");
	}
	public void ifex3(int score) {
		if(score >= 90)
			System.out.println("[IfEx3] - A학점 입니다.");
		else if(score >=80)
			System.out.println("[IfEx3] - B학점 입니다.");
		else if(score >=70)
			System.out.println("[IfEx3] - C학점 입니다.");
		else if(score >=60)
			System.out.println("[IfEx3] - D학점 입니다.");
		else
			System.out.println("[IfEx3] - F학점 입니다.");
	}
	public String ifex4(int score) {
		String grade = "";
		if(score >= 90) 
		{
			if(score >=95)
				grade = "A+";
			else
				grade = "A0";
		}
			
		else if(score >=80)
		{
			if(score >=85)
				grade = "B+";
			else
				grade = "B0";
		}
		else if(score >=70)
		{
			if(score >=75)
				grade = "C+";
			else
				grade = "C0";
		}
		else if(score >=60)
		{
			if(score >=65)
				grade = "D+";
			else
				grade = "D0";
		}
		else
			grade = "F";
		
		return grade;
	}
}
