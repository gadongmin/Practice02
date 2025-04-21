package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호: ");
        String sign = sc.next();
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		int result = 0;
				
		switch(sign) {
			case "+" : result = num1 + num2;
			break;
			case "-" : result = num1 - num2;
			break;
			case "*" : result = num1 * num2;
			break;
			case "/": result = num1 / num2;
			default : 
				System.out.println("계산할 수 없는 기호입니다.");
			if (num2 == 0) {
		        	System.out.println("계산할 수 없습니다.");
			}
			
		}
        System.out.print("결과는: " + result);
		
		sc.close();

	}

}
