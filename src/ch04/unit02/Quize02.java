package ch04.unit02;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		String c;
		
		System.out.print("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("연산자 [+, -, *, /] ? ");
		c = sc.next();
		
		switch(c) {
		case "+" : System.out.printf("%d+%d=%d", a, b, a+b); break;
		case "-" : System.out.printf("%d-%d=%d", a, b, a-b); break;
		case "*" : System.out.printf("%d*%d=%d", a, b, a*b); break;
		case "/" : System.out.printf("%d/%d=%d", a, b, a/b); break;	
		default: System.out.println("연산자 입력 값 오류");
		}
		
		sc.close();
	}

}
