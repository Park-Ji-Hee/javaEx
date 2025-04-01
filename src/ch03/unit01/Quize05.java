package ch03.unit01;

import java.util.Scanner;

public class Quize05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("주행 거리(km) ? ");
//		int d = sc.nextInt();
//		System.out.print("시속(km/h) ? ");
//		int f = sc.nextInt();
//		
//		int h, m, s;
//		h = d / f;
//		m = (d % f) / f;
		
		
		int distance, speed;
		int hour, min;
		double seconds;
		double time;
		
		
		System.out.print("주행 거리(km) ? ");
		distance = sc.nextInt();
		
		System.out.print("시속(km/h) ? ");
		speed = sc.nextInt();
		
		time = (double)distance / speed;
		hour = (int)time;
		min = (int) ((time * 60) % 60);
		seconds = (time * 3600) % 60;
		
//		*****반올림 안하고 버리는 방법
//		100 곱해주고 (곱해주는 값 == 버리기 직전값까지 정수로 만들어줌)
//		100.0으로 나눠주기 (소수점 단위로 만들기 위해서 실수로 나누어줌 == 100이 아닌 100.0으로 나눠줌)
		seconds = (int)(seconds *100) / 100.0; // 소수점 3째자리버림
		
		
		System.out.println("주행거리 : " + distance + "km");
		System.out.println("시속(km/h) : " + speed);
		System.out.printf("%d시간 %d분 %.2f초 소요\n : ", hour, min, seconds);
		
		sc.close();

	}

}

