package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해 주세요.");
		long year = sc.nextLong();
		long sub = 2023 - year; 
		
		if(sub >= 65) {
			System.out.println(sub + "살 무료예방접종 대상자 입니다.");
		
		}else {
			System.out.println(sub + "살 무료예방접종 대상자가 아닙니다.");
		}
				
		sc.close();

	}

}
