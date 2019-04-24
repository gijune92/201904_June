package com.java0424;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Calc c = new Calc();
		int i_res = 0;
		float f_res = 0.f;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계산기 입니다.");
		System.out.print("첫번째 수를 입력하세요 : ");
		int aval = scan.nextInt();
		
		String s_operlator = "";
		System.out.print("연산자를 입력하세요 : ");
		s_operlator = scan.next();
		
		System.out.print("두번째 수를 입력하세요 : ");
		int bval = scan.nextInt();
		/*
		if(s_operlator.equals("+"))
		{
			i_res = c.plus(aval, bval);
			System.out.println("결과 값은 : "+ i_res +" 입니다.");
		}
		else if(s_operlator.equals("-"))
		{
			i_res = c.minus(aval, bval);
			System.out.println("결과 값은 : "+ i_res +" 입니다.");
		}
		else if(s_operlator.equals("*"))
		{
			f_res = c.multiful(aval, bval);
			System.out.println("결과 값은 : "+ f_res +" 입니다.");
		}
		else if(s_operlator.equals("/"))
		{
			f_res = c.division(aval, bval);
			System.out.println("결과 값은 "+ f_res +" 입니다.");
		}
		else 
			System.out.println("연산자가 잘못되었습니다.");
		*/
		
		switch(s_operlator)
		{
		case "+":
			System.out.println("결과 값은 "+ c.plus(aval, bval) +" 입니다.");
			break;
		case "-":
			System.out.println("결과 값은 "+ c.minus(aval, bval) +" 입니다.");
			break;
		case "*":
			System.out.println("결과 값은 "+ c.multiful(aval, bval) +" 입니다.");
			break;
		case "/":
			System.out.println("결과 값은 "+ c.division(aval, bval) +" 입니다.");
			break;
		default :
			System.out.println("연산자가 잘못되었습니다.");
			break;
		}
		
		scan.close();
		

	}

}
