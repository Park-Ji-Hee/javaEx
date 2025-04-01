package ch04.unit03.forEx;

import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		
		// 입력 받은 수까지 합 구하기
		Scanner sc = new Scanner(System.in);
	
		int a;
		int s;
		
		do {
			System.out.print("수 ? ");
			a = sc.nextInt();
		} while (a < 1 || a > 1000);
		
		s = 0;
		for(int n = 1 ; n <= a; n++) {
			s+=n;
		}
		System.out.printf("1~%d까지의 합 : %d", a, s);
		sc.close();
	}

}
