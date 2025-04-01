package ch02.unit04;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		/*
		 	- 문자를 입력 받아 입력 받은 ASCII 코드 출력
		 	- 출력 예
		 	  문자 ? A
		 	  A -> 65
		 */
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.println("문자 ? ");
		ch = sc.next().charAt(0);
		
		// 코딩
		
		// 1. 방법
		// System.out.printf("%c -> %d\n", ch, ch);	// ch, ch => 런타임 오류
		System.out.printf("%c -> %d\n", ch, (int)ch);	
		
		// 2. 방법
		int n = ch;
		System.out.printf("%c -> %d\n", ch, n);
		
		sc.close();
		
		
		
	}

}
