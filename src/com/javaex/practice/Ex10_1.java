package com.javaex.practice;

import java.util.Scanner;

public class Ex10_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("숫자 2개를 입력해주세요.");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		int max, min;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		
		}else{
			max = num2;
			min = num1;
		}
		
		System.out.println("큰수: " + max + "		" +"작은수: " + min + "  입니다.");
		
		
		sc.close();

	}

}
