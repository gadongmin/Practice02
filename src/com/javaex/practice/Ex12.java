package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 3개를 입력해주세요.");
		System.out.print("숫자 1: ");
		long num1 = sc.nextLong();
		System.out.print("숫자 2: ");
		long num2 = sc.nextLong();
		System.out.print("숫자 3: ");
		long num3 = sc.nextLong();

		long min = num1;
		if(num2 < min) min = num2;
		if(num3 < min) min = num3;
		
		System.out.println("가장 작은수는 " + min + " 입니다.");
		
		sc.close();
	}
}
