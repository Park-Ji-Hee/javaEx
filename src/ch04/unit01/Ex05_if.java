package ch04.unit01;

import java.util.Scanner;

public class Ex05_if {

	public static void main(String[] args) {
		// 세개의 정수를 입력 받아 적은 수에서 큰 수 순으로 출력
			Scanner sc = new Scanner(System.in);
			
			int a, b, c;
			System.out.println("세 수 입력 ? ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			int t;
			if (a > b) {
				t =a; a= b; b = t;
			}
			if (a > c) {
				t =a; a= c; c = t;
			}
			if (b > c) {
				t =b; b= c; c = t;
			}
			System.out.println(a + ", " + b + ", " + c);
			
			
			/* 내가 만든 문장
	 			if (a>b && b>c) {
					System.out.printf("%d\t %d\t %d\t", a, b, c);
				} else if (a>b && c>b) {
					System.out.printf("%d\t %d\t %d\t", a, c, b);
				} else if (b>a && a>c) {
					System.out.printf("%d\t %d\t %d\t", b, a, c);
				} else if (b>a && c>a) {
					System.out.printf("%d\t %d\t %d\t", b, c, a);
				} else if (c>a && a>b) {
					System.out.printf("%d\t %d\t %d\t", c, a, b);
				} else {
					System.out.printf("%d\t %d\t %d\t", c, b, a);
				}
			 */
			
			sc.close();
	}

}
