package ch04.unit01;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 ? ");
		int y = sc.nextInt();
		
		String s;
		if(y%4==0 && y%100!=0 || y%400==0) {
			s = "윤년";
		} else {
			s = "평년";
		}
		
		System.out.println(y + "년도는 " + s + "입니다.");
		
		sc.close();
	}

}
