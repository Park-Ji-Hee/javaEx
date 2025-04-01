package ch03.unit01;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		// 초를 입력 받아 시분초 구하기
		 Scanner sc = new Scanner(System.in);
		 int seconds;
		 
		 System.out.print("초를 입력하세요 ?");
		 seconds = sc.nextInt();
		 
		 // 코드
		 int h, m, s;
		 
		 h = seconds / 3600;
		 m = (seconds / 60) % 60;
		 s = seconds % 60;
		 
		 System.out.printf("%d초는 %d시간 %d분 %d초입니다.\n", seconds, h, m, s);
		 
		 sc.close();
	}

}
