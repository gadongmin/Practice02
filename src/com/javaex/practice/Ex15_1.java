package com.javaex.practice;

import java.util.Scanner;

public class Ex15_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호: ");
		String sign = sc.nextLine();
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		double result;
		
		switch(sign) {
		case "+" :
			result = num1 + num2;
			System.out.print("결과는: " + result);
			break;
			
		case "-" :
			result = num1 - num2;
			System.out.print("결과는: " + result);
			break;
			
		case "*" :
			result = num1 * num2;
			System.out.print("결과는: " + result);
			break;
		
		case "/" :
			if(num2 == 0) {
				System.out.println("계산할 수 없습니다.");	
			
			}else{
				result = num1 / num2;
				System.out.print("결과는: " + result);
			}
			break;
		
		default :
			System.out.println("계산할 수 없는 기호입니다.");
			break;			
		}
		sc.close();

	}
	

}
