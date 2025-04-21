package com.javaex.practice;

public class Ex01 {
	public static void main(String[] args) {
		
		/*
		(1) if (i = 0)
			-에러는 아니지만, 논리적 오류가 발생할 수 있습니다.
			i = 0은 대입문으로, 조건식에서 참(true) 또는 거짓(false)으로 평가되긴 합니다.
			하지만 일반적으로 비교(==)를 의도했을 가능성이 높기 때문에 논리적 오류가 발생합니다.
			문법적 에러는 아님. (하지만 ==을 사용해야 의도에 맞을 가능성 큼)

		(2) if(j < 10), 정상적인 문장
		
		(3) switch( 'A'), 정상적인 문장
     	    - switch는 정수형, 문자형(char)에 대해 동작하므로 'A'는 유효합니다.

		(4) switch(100), 정상적인 문장

		(5) switch( "A")
			- "A"는 문자열 리터럴(const char* 또는 String)로, C/C++에서는 포인터, Java에서는 참조 타입입니다.
			  switch 문은 정수형, 문자형만 허용하며, 문자열은 사용할 수 없습니다.

		(6) if(name == "홍길동"), 정상적인 문장
		*/
	
	}
}
