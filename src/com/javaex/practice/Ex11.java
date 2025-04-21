package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자: ");
		long num1 = sc.nextLong();
		System.out.print("두번째 숫자: ");
		long num2 = sc.nextLong();

		if(num1>num2) {
			System.out.print("몫: ");
			System.out.print(num1 / num2);
			System.out.println("");
			System.out.print("나머지: ");
			System.out.print(num1 % num2);

		}else{
			System.out.print("몫: ");
			System.out.print(num2 / num1);
			System.out.println("");
			System.out.print("나머지: ");
			System.out.print(num2 % num1);
		}
		
		sc.close();
	}

}
