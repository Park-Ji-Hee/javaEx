package ch04.unit03;

import java.util.Scanner;

public class Ex07_while {

	public static void main(String[] args) {
		// 양의 정수를 입력 받아 입력 받은 수까지 홀수합 구하기
		Scanner sc = new Scanner(System.in);
		int num, n =1 , s=0;
		
		System.out.print("양의 정수 ? ");
		num = sc.nextInt();
		
		while(n <= num) {
			s += n;
			n += 2;
		}
		System.out.println("합 : " + s);
		
		sc.close();
	}

}

