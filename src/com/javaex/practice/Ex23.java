package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("태어난 년도를 입력해 주세요.");
		System.out.print("년도: ");
		long year = sc.nextLong();
		long tyear = 2023;
		System.out.println("올해: " + tyear);
		System.out.println("태어난해: " + year);
		long age = tyear - year;
		System.out.println("나이: " + age);
		System.out.println("=========================");
		
		if(age >= 20) {
			System.out.println("20살 이상");	
		}else {
			System.out.println("20살 미만");
		}
		
		if(tyear % 2 == 0) {
			System.out.println("건강검진 대상이 아닙니다.");
		}else {
			System.out.println("건강검진 대상이 맞습니다.");
		}
		
		if(age >= 40) {
			System.out.println("암검사 O");
		}else {
			System.out.println("암검사 X");
		}
		
		sc.close();
		
	}

}
