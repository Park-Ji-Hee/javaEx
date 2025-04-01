package ch04.unit01;

import java.util.Scanner;

public class Quize07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		String n, result;
		
		System.out.print("이름 ? ");
		n = sc.next();
		System.out.print("세과목 점수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		d = (a + b + c)/3; 
		
		if (a>= 40 && b>=40 && c>=40 && d>=60) {
			result = "합격";
		} else if (d < 60) {
			result = "불합격";
		} else {
			result = "과락";
		}
		
		System.out.printf("%s님은 %s 입니다.\n", n, result);
		
		sc.close();
	}

}
