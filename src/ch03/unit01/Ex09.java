package ch03.unit01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		//	반지름을 입력 받아 원의 넓이 둘레 계산
		//	넓이 = 반*반*3.14
		//	둘레 = 반*2*3.14
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 ? ");
		int r = sc.nextInt();
		
		//	double a = r * r * 3.14;	
		//	r = 50000이라면 => r*r에서 overflow 발생, 반지름이 50000이면 음수
		//	double a = (double)r * r * 3.14;	// double 타입으로 형변환하여 값의 넓이 넓혀준 다음에 계산
		double a = 3.14 * r * r;
		double b = r * 2 * 3.14;
		
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + b);
//		System.out.printf("둘레 : %.1f", b);	// 구냥 만들어본거
		
		sc.close();
	}
}
