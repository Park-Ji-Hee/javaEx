package ch04.unit03;

import java.util.Scanner;

public class Quize002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s,n;
		s = n = 0;
		
		while(n<10) {
			n++;
			if(n%2==0) {
				s-=n;
			} else {
				s+=n;
			}
		}
		
//		while(n<10) {
//			n++;
//			s += n;
//			n++;
//			s -= n;
//		}
		
//		while(n<10) {
//			n++;
//			s = n%2==0 ? s-n:s+n;
//		}
		
		System.out.println("결과 : " + s);
		
		sc.close();
	}

}
//		// 10까지 더하기
//		while(n<10) {
//			n++;
//			s+=n;
//		}