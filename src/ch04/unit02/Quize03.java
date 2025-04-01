package ch04.unit02;

import java.util.Scanner;

public class Quize03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y, m;
		int d = 0;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		System.out.print("월 ? ");
		m = sc.nextInt();
		
		switch(m) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: d=31; break;
		case 4: case 6: case 9: case 11: d=30; break;
		case 2 : 
			
			d = y%4==0 && 100!=0 || y%400==0 ? 29 : 28; break;
			
			/*
			d=28; 
			if(y%4==0 && 100!=0 || y%400==0) {
				d=29;
			}
			break;
			*/
		
		default : 
		}
		
		if (d != 0) {
		System.out.printf("%d년 %d월은 %d일까지 있습니다.", y, m, d);	
		} else {
			System.out.println("날짜 입력 오류 입니다");
		}

		sc.close();
	}

}
