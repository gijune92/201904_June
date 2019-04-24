package com.java0424;
import java.util.Scanner;

public class Main4 {

	public void main(String[] args) {
		IfEx ex = new IfEx();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		
		int score = sc.nextInt();
		ex.ifex1(score);
		ex.ifex2(score);
		ex.ifex3(score);
		System.out.println("[IfEx4] - "+ex.ifex4(score) + " 학점 입니다.");
		

	}

}
