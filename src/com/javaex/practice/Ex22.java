package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 3개를 입력해주세요.");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		System.out.print("숫자3: ");
		int num3 = sc.nextInt();
		int max = num1;
		
		if(num2 > max) max = num2;
		if(num3 > max) max = num3;
		System.out.println("가장 큰 수는 " + max + " 입니다.");
		
		sc.close();
		
	}

}
