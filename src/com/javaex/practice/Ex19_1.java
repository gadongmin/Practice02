package com.javaex.practice;

import java.util.Scanner;

public class Ex19_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해주세요.");
		System.out.print("년도: ");
		int year = sc.nextInt();
		int age = 2023-year;
		
		if(age<15 || age>=65) {
			System.out.println(age + "살 무료예방접종 대상자입니다.");
		}else {
			System.out.println(age + "살 무료예방접종 대상자가 아닙니다.");
		}
		
		sc.close();
	}
}
