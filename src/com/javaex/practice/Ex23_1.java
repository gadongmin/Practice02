package com.javaex.practice;

import java.util.Scanner;

public class Ex23_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해주세요.");
		System.out.print("년도: ");
		int year = sc.nextInt();
		System.out.print("올해: 2023");
		System.out.println("");
		System.out.print("태어난해: " + year);
		System.out.println("");
		int age = 2023 - year;
		System.out.print("나이: " + age);
		System.out.println("");
		
		System.out.println("==========================");		
		if(age >= 20) {
			System.out.println("20살 이상");
			if(year % 2 == 1) {
				System.out.println("건강검진해");	
			}else {
				System.out.println("건강검진 대상이 아님");
			}
		}else {
			System.out.println("20살 미만");
		}
		
		if(age >= 40) {
			System.out.println("암검사");
		}else {
			System.out.println("암검사X");
		}
		
		sc.close();

	}

}
