package ch04.unit03;

public class Ex10_while {

	public static void main(String[] args) {
		// 1/2 + 2/3 + 3/4 + ... 9/10의 겨로가
		
//		int n=1;
//		double s = 0;
//		
//		while(n < 10) {
//			s = (double)n/(n+1);
//			n++;
//		}
//		System.out.println(s);
		
		int n = 0;
		double s = 0;
		while(n < 9) {
			n++;
			s = (double)n/(n+1);
		}
		System.out.println("결과 : " + s);
		
		
	}

}
