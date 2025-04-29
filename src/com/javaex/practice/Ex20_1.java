package com.javaex.practice;

import java.util.Scanner;

public class Ex20_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
		System.out.print("알파벳: ");
		String vo = sc.nextLine();
		
		if(vo.equals("a") || vo.equals("e") || vo.equals("i") || vo.equals("o") || vo.equals("u") ) {
			System.out.println("모음입니다.");
		
		}else {
			System.out.println("자음입니다.");
		}
		
		sc.close();

	}

}
