package com.java0424;

import java.util.Scanner;

public class Main2 {

	public void main(String[] args) {
		Conditional c = new Conditional();

		System.out.print("t1 : ");
		c.t1(120);
		
		boolean r= c.t2(10);
		System.out.println("t2 : " + r);
		System.out.println("t3 : " + c.t3(5,3));
		System.out.println("t4 : "+ c.t4(1,5));
		System.out.println("t5 : "+ c.t5(1,5));
		System.out.println("t6 : "+ c.t6(1,5));
		System.out.println("t7 : "+ c.t7(1, 5));
		System.out.println("t8 : " + c.t8(1));
		System.out.println("t9 : "  +c.t9(0));
		
		System.out.print("점수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		String Score = c.t10(scan.nextInt());
		scan.close();
		System.out.println(Score + " 학점 입니다.");
		
		
	}

}
