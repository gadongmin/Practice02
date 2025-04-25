package com.javaex.practice;

import java.util.Scanner;

public class Ex13_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		int max, min;
		if(num1 > num2) {
			max = num1;
			min = num2;
		
		} else {
			max = num2;
			min = num1;
		}
		
		if(max % min == 0) {
			System.out.println(min + "는(은) " + max + "의 약수입니다.");
		
		}else {
			System.out.println(min + "는(은) " + max + "의 약수가 아닙니다.");
		}
		sc.close();

	}

}
