package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x의 값을 입력하시오");
		int x = sc.nextInt();
		if(x == 0) {
			System.out.println("x는 0입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		
		
		sc.close();

	}

}
