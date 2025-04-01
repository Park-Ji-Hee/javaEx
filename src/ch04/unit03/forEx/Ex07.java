package ch04.unit03.forEx;

public class Ex07 {

	public static void main(String[] args) {
		// 1~100까지 홀수 합
		int n, s;
		
		for(n = 1, s = 0; n <= 100; n+=2) {
			s+=n;
		}
		System.out.println("합 : "+ s);
	
		
		// 1~100까지 짝수 합
		// int n, s; // 컴파일 오류
		
		for(n = 2, s = 0; n <= 100; n+=2) {
			s+=n;
		}
		System.out.println("합 : "+ s);
		
		
		
	}

}
