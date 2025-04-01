package ch04.unit03;

public class Quize008 {

	public static void main(String[] args) {
		// 1 + 2 + 4 + 7 + 11 + ... : 20개(20번은 돌려야 함)
		// n 만큼 커짐
		
		int n = 0;
		int s = 0;
		int t = 1;
		
		while(n < 20) {
			s +=t;
			n++;
			t += n;
		}
		System.out.println("결과 : "+s);
	}

}
