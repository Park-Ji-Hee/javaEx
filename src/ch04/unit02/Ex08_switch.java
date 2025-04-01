package ch04.unit02;

import java.util.Scanner;

public class Ex08_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		var s = switch (n/10) { // var : 서로 다른 타입도 가능(자료형이 서로 다른 값을 받아야 되기 때문에)
			case 9, 10 -> 4.0; 
			case 8 -> 3.0; 
			case 7 -> 2.0; 
			case 6 -> 1.0; 
			case 0, 1, 2, 3, 4 , 5 -> 0.0; 
			default -> "점수입력 에러";
		};
		 
		System.out.println("정수 : " + n + "평점 : " + s);
		
		
		sc.close();
	}

}
