package ch04.unit01;

import java.util.Scanner;

public class Quize04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 ? ");
		int s = sc.nextInt();
		
		
		double a;
		if(s >= 0 && s <= 100) {
			if (s >= 95) {
				a = 4.5;
			} else if (s >= 90) {
				a = 4.0;
			} else if (s >= 85) {
				a = 3.5;
			} else if (s >= 80) {
				a = 3.0;
			} else if (s >= 75) {
				a = 2.5;
			} else if (s >= 70) {
				a = 2.0;
			} else if (s >= 65) {
				a = 1.5;
			} else if (s >= 60) {
				a = 1.0;
			} else if (s >= 0) {
				a = 0.5;
			} else {
				a = 0.0;
			}
			
			System.out.println("점수 : " + s + ", 평점 : " + a);
			// System.out.printf("점수 : %d, 평점 : %.1f\n", s, a);
		} else {
			System.out.println("점수 입력 오류 입니다.");
		}
		
		sc.close();
	}

}
