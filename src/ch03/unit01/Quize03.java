package ch03.unit01;

import java.util.Scanner;

public class Quize03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 ? ");
		int m = sc.nextInt();
		
		int a, b, c, d, e, f, g, h, i, j;
		
		a = m / 50000;
		b = (m / 10000) % 5;
		c = (m / 5000) % 2;
		d = (m / 1000) % 5;
		e = (m / 500) % 2;
		f = (m / 100) % 5;
		g = (m / 50) % 2;
		h = (m / 10) % 5;
		i = (m / 5) % 2;
		j = (m / 1) % 5;
		
		
//		System.out.println("오만원권 : " + a);
//		System.out.println("만원권 : " + b);
//		System.out.println("오천원권 : " + c);
//		System.out.println("천원권 : " + d);
//		System.out.println("오백원권 : " + e);
//		System.out.println("백원권 : " + f);
//		System.out.println("오십원권 : " + g);
//		System.out.println("십원권 : " + h);
//		System.out.println("오원권 : " + i);
//		System.out.println("일원권 : " + j);
//		
		System.out.printf("오만원권 : %d\n", a);
		System.out.printf("만원권 : %d\n", b);
		System.out.printf("오천원권 : %d\n", c);
		System.out.printf("천원권 : %d\n", d);
		System.out.printf("오백원권 : %d\n", e);
		System.out.printf("백원권 : %d\n", f);
		System.out.printf("오십원권 : %d\n", g);
		System.out.printf("십원권 : %d\n", h);
		System.out.printf("오원권 : %d\n", i);
		System.out.printf("일원권 : %d\n", j);
		
		
		sc.close();
	}

}
