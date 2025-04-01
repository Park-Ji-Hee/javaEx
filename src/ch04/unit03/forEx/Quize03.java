package ch04.unit03.forEx;

import java.util.Scanner;

public class Quize03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		int odd, even;
		
		odd = even = 0;
		
		System.out.println("10개의 정수를 입력");
		for(int n = 1 ; n <= 10 ; n++) {
			input = sc.nextInt();
			if(input % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		
		}
		System.out.println("홀수의 개수 : " + odd);
		System.out.println("짝수의 개수 : " + even);
		
		sc.close();
	}

}
