package com.javaex.practice;

import java.util.Scanner;

public class Ex16_1 {

	public static void main(String[] args) {
		
		double num;
		double result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		System.out.print("숫자: ");
		num = sc.nextDouble();
		
		if(num <= 0) {
			result = num * num * num - 9* num + 2;
		}else {
			result = 7 * num + 2;
		}
		sc.close();
		System.out.println("계산결과는 " + result + " 입니다.");

	}

}
