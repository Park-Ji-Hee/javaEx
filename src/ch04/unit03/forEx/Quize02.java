package ch04.unit03.forEx;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		do {
			System.out.print("단 ? ");
			a = sc.nextInt();
		} while (a < 1 || a > 9);
		
		for(int n = 1; n <= 9; n++) {
			System.out.printf("%d * %d = %d\n", a, n, a*n);
		}
		sc.close();
	}

}
