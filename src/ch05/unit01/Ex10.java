package ch05.unit01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 요일 구하기
		// 1.1.1 ~ 입력받은 날짜까지 전체 일 수 계상해서 7로 나눈 나머지가 요일
		Scanner sc = new Scanner(System.in);
		
		String []week = new String[] {"일", "월", "화", "수", "목", "금", "토"};
		int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 3, 31, 30, 31};
		
		int y, m, d;
		int total;
		
		do {
			System.out.println("년도 ? ");
			y = sc.nextInt();
		} while (y < 1);
		
		do {
			System.out.println("월 ? ");
			m = sc.nextInt();
		} while (m <1 || m>12);
		
		// 2월의 마지막 일자
		days[1] = y%4==0 && y%100!=0 || y%400==0 ? 29 :28;
		
		do {
			System.out.println("일 ? ");
			d = sc.nextInt();
		} while (d <1 || d > days[m-1]);		

		// 1.1.1 ~ y.m.d 까지 전체 일수
		// 1.1.1 ~ 2025.3.26
		// total = (2025 - 1) * 365 + (2025-1)/4 - (2025-1)/100 + (2025-1)/400 + 1월 + 2월 + 26일
		
		total = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		for( int i = 0; i <(m-1) ; i++) { // 월 계산/합산
			total +=days[i];
		}
		total +=d; // 일 합산
		
		int w = total % 7;
		System.out.printf("%d년 %d월 %d일은 %s요일 입니다.\n", y, m, d, week[w]);
		
		sc.close();
	}

}
