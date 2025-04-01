package ch02.unit04;

import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		/*
		 - 정수를 입력 받아 입력 받은 정수를 ASCHII 코드로 하는 문자 출력
		 - 출력 예
		 	ASCHII 코드 : 65
		 	65 -> A
		 */
	
		Scanner sc = new Scanner(System.in);
		int asc;
		
		System.out.print("ASCHII 코드값 ");
		asc = sc.nextInt();
		
		// 코딩 ******** 기억하기
		System.out.printf("%d -> %c\n", asc, asc);
		
		sc.close();
		
	}

}
