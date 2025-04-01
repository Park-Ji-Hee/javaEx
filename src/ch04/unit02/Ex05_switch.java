package ch04.unit02;

import java.util.Scanner;

public class Ex05_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		System.out.print("코드[A1, A2, A3] 입력 ? ");
		s = sc.next();
		
		// 문자열도 가능하다.
		switch(s) {
		case "A1": System.out.println("자바"); break;
		case "A2": System.out.println("스프링"); break;
		case "A3": System.out.println("오라클"); break;
		default: System.out.println("입력 오류...");
		}
		
		sc.close();
	}

}
