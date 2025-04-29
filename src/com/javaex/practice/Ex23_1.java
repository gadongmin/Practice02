package com.javaex.practice;

import java.util.Scanner;

public class Ex23_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해주세요.");
		System.out.print("년도: ");
		int year = sc.nextInt();
		System.out.print("올해: ");
		int tyear = 2023;
		System.out.print("태어난해: ");
		int byear = year;
		System.out.print("나이: ");
		int age = tyear-byear;
		
		if(tyear % 2 == 0) {
			if(byear % 2 == 0) {
				System.out.println("건강검진해");
			}else {
				System.out.println("");
			}
			
			if(age>=20) {
				if(age>=40) {
					System.out.println("20살이상");
					System.out.println("암 검사");
				}else {
					System.out.println("20살 미만 건강검진 대상이 아님");
				}
			}
		}
		
		sc.close();

	}

}
