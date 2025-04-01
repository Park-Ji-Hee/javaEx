package ch04.unit01;

import java.util.Scanner;

public class Quize05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간 ? ");
		int h = sc.nextInt();
		
		double m;
		if(h > 8) {
			m = 8*10000 + (int)((h-8)*1.5*10000);	// 형변환 시켜줘야함
			// pay += (h-8)*1.5*10000;  이렇게 하면 형변환 하지 않아도 됨
		} else {
			m = h*10000;
		}
		
		/* 다른 방법
		 int pay, rate = 10000;
		 
		 System.out.print("근무시간 ? ");
		 h = sc.nextInt();
		 
		 if(h > 8) {
		 	pay = 8 * rate + (int)((h-8) * rate * 1.5);
		 } else {
		 	pay = h * rate;
		 }
		 */
		
		System.out.printf("급여 : %,d원", (int)m);
		
		sc.close();
	}

}
