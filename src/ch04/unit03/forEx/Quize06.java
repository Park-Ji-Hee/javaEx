package ch04.unit03.forEx;

import java.util.Scanner;

public class Quize06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 처음 입력 받은 수를 초기값으로 할당
		/*
		int input;
		int min = 0;
		System.out.println("10개의 정수 입력...");
		for(int i = 1; i <= 10 ; i++) {
			input = sc.nextInt();
			if(i == 1 || input < min) {
				min = input;
			}
		}
		System.out.println("결과: "+min);
		*/
		
		// 가장 큰 수를 초기값으로 할당
		int input;
		int min = 0x7FFFFFFF;	// 정수 중 가장 큰 수
		System.out.println("10개의 정수 입력...");
		for(int i = 1; i <= 10 ; i++) {
			input = sc.nextInt();
			if(i == 1 || input < min) {
				min = input;
			}
		}
		System.out.println("결과: "+min);
		
		
		sc.close();
	}

}
