package ch04.unit03.forEx;

import java.util.Scanner;

public class Quize05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 가장 처음 입력 받은 수를 초기값으로 할당 
		/*
		int input;
		int max;
		
		System.out.println("10개의 정수 입력...");
		max = sc.nextInt(); // 초기 값을 기준점으로 사용
		for(int n = 1; n < 10 ; n++) { // 앞에서 한값 입력 받았으므로 9회만 반복시키게 설정함
			input =sc.nextInt();
			if(input > max) {
				max = input;
			} 
		}
		System.out.println("최대값 : " + max);
		*/
		
		
		// 가장 처음 입력 받은 수를 초기값으로 할당 
		/*
		int input;
		int max = 0;
		
		System.out.println("10개의 정수 입력...");
		for(int n = 1; n <= 10 ; n++) { 
			input =sc.nextInt();
			if(n==1 || input > max) { // n==1 은 처음 입력 받은 경우
				max = input;
			} 
		}
		System.out.println("최대값 : " + max);
		*/
		
		
		// 가장 적은 수를 초기값으로 할당
		int input;
		int max = 0x80000000; // 정수 중 가장 적은 수
		
		System.out.println("10개의 정수 입력...");
		for(int n = 1; n <= 10 ; n++) { 
			input =sc.nextInt();
			if(input > max) {
				max = input;
			} 
		}
		System.out.println("최대값 : " + max);
		

		sc.close();
	}

}
