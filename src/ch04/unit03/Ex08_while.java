package ch04.unit03;

public class Ex08_while {

	public static void main(String[] args) {
		// 10! 계산(1*2*..*10)
		
		int n=0, s=1;
		while(n < 10) {
			n ++;
			s *= n;
		}
		System.out.println("결과 : " + s);
		
		
//		int n=1, s=1;
//		while(n <= 10) {
//			s *= n;
//			n ++;
//		}
//		System.out.println("결과 : " + s);
		
	}

}
