package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		
		int age = sc.nextInt();
		if (age > 20) {
			System.out.print("1번 그룹");
		}else {
			System.out.print("2번 그룹");
		}
		System.out.print(" 입니다.");
		
		sc.close();
	}
}

/* 
   15 - 2번
   19 - 2번
   20 - 1번
   21 - 1번
   100 - 1번
 */