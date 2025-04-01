package ch03.unit01;

import java.util.Scanner;

public class Quize04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 온도 ? ");
		int d = sc.nextInt();
		
		double f = d * 1.8 + 32 ;
		
		System.out.printf("화씨온도 : %.1f\n", f);
		
//		int c;
//		double f;
//		
//		System.out.print("섭씨 온도 ? ");
//		c = sc.nextInt();
//		
//		f = c * 1.8 + 32 ;
//		System.out.printf("화씨온도 : %.1f\n", f);
		
		sc.close();

	}

}

//package ch04.unit01;
//import java.util.Scanner;
//public class Quize04 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("섭씨 온도 ? ");
//		int d = sc.nextInt();
//		
//		double f = d * 1.8 + 32;
//		
//		System.out.printf("화씨온도 : %.1f", f);
//		
//		sc.close();
//	}
//}

