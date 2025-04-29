package com.javaex.practice;

import java.util.Scanner;

public class Ex22_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요.");
		System.out.print("숫자 1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2: ");
		int num2 = sc.nextInt();
		System.out.print("숫자 3: ");
		int num3 = sc.nextInt();
		
		int max = num1;
		if(num1 < num2) {
			max = num2;
		}
		if(num1 < num3) {
			max = num3;
		}
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
		sc.close();
	}

}
