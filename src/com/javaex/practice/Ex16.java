package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력해주세요.");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("계산결과는: " + (double)(num * num * num - 9 * num + 2) + " 입니다.");
		}else if(num > 0) {
			System.out.println("계산결과는: " + (double)(7 * num + 2) + " 입니다.");
		}
				
		sc.close();
		
	}

}
