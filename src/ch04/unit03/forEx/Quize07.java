package ch04.unit03.forEx;

import java.util.Scanner;

public class Quize07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, t;
		int s, cnt;
		
		System.out.print("두 수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		// 적은 수는 a, 큰 수는 b에
		if(a > b) {
			t = a; a=b; b=t;
		}
		
		s= cnt = 0;
		for(int n = a; n<=b; n++) {
			if(n%3 == 0 || n%5 ==0) {
				s+=n;
				cnt++;
			}
		}
		
		if(cnt != 0) { // cnt가 0 이되면 나오는 에러를 예방하기 위해 조건 넣음
			System.out.println("합 : " + s);
			System.out.println("평균 : " + (double)(s/cnt));
		} else {
			System.out.println("데이터가 존재하지 않습니다.");
		}
		
		sc.close();
	}

}
