package ch04.unit04;

import java.util.Scanner;


//	1. 합 2. 짝수합 3. 홀수합 4. 종료 => 1
//	수 ? 10
//	1~10까지의 합 : 55
//	
//	1. 합 2. 짝수합 3. 홀수합 4. 종료 => 2
//	수 ? 10
//	1~10까지의 짝수합 : 30
//	
//	1. 합 2. 짝수합 3. 홀수합 4. 종료 => 2


public class Quize01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch, input;
		int s;
		
		while(true) {
			do {
				System.out.println("1. 합 2. 짝수합 3. 홀수합 4. 종료");
				ch = sc.nextInt();
			} while (ch<1 || ch>4);
			
			if(ch == 4) {
				System.out.println("프로그램 종료 !!!");
				break;
			}
			
			System.out.println("수 입력 ? ");
			input = sc.nextInt();
			
			
			s=0;	// 위에서 값 주면 무적값되어서 본 위치에 찍어야 함
			if(ch==1) {
				for(int n=1; n <= input; n++) {
					s += n;
				} System.out.println("합 : "+ s);
			} else if(ch==2) {
				for(int n=0; n<= input; n+=2) {
					s += n;
				} System.out.println("짝수합 : "+ s);
			} else {
				for(int n=1; n<= input; n+=2) {
					s += n;
				} System.out.println("홀수합 : "+ s);
			}
			

			
		}
			
		sc.close();
	}

}
