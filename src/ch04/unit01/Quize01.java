package ch04.unit01;

import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째수 ? ");
		int a = sc.nextInt();
		System.out.print("두번째수 ? ");
		int b = sc.nextInt();
		
		int c;
		if (a > b ) {
			c = a-b; 
		} else {
			c = b-a;
		}
		
		/* 이렇게 작성하는 방법도 있음!!!
		 int c = a - b;
		 if (c <0) {
		 	c = -c;
		 }
		 */
		
		
		System.out.print("두 수의 차이 : " + c);

		sc.close();
	}

}
