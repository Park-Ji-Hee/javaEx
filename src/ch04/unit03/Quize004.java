package ch04.unit03;

public class Quize004 {

	public static void main(String[] args) {
		int n;
		int s, cnt;
		
		n=0;
		s=0;
		cnt=0;
		
		while(n<100) {
			n++;
			if(n%3==0 || n%5==0) {
				s += n;	// 합
				cnt++;	// 개수
			}
		}
		System.out.println("합 : " + s);
		System.out.println("평균 : " + (s/cnt));

	}

}
