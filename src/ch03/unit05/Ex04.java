package ch03.unit05;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 두 정수를 입력 받아 입력 받은 수 사이의 정수 개수 구하기
		// 두 정수 ? 3 5
		// 두 수 사이의 정수의 개수 : 3
		int a, b, c;
		
		System.out.print("두 정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
//		c = a > b ? (a-b +1) : ((b > a)? (b-a + 1) : 0);
		
		c = a > b ? (a-b +1) : (b-a);
		
		System.out.println("두 수 사이의 정수의 개수 : " + c);

		sc.close();
	}

}
