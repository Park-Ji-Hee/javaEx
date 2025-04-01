package ch04.unit02;

import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 ? ");
		int s = sc.nextInt();
		
		String r = "";
		
		switch(s / 10) {// 수식이 들어올 수 있음, 
		case 10: 		//	값만 올 수 있음
		case 9: r = "수"; break;
		case 8: r = "우"; break;
		case 7: r = "미"; break;
		case 6: r = "양"; break;
		default: r = "가"; break;
		}
		System.out.printf("점수 : %d, 판정 : %s\n", s, r);
		
		sc.close();
	}

}
