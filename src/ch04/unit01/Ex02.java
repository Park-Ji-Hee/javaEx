package ch04.unit01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 홀수 인지 판별할 수 있는
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		if (n%2 == 1) {
			System.out.println(n + "은 홀수 입니다.");
		}
		
		/*
		 if ((n&2) == 1) { // &보다 == 속도가 더 빠르기 때문에 ()괄호 해줘야 함
			System.out.println(n + "은 홀수 입니다.");
			}
		 */
		sc.close();
	}

}
