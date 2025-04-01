package ch04.unit05;

public class Ex01_continue {

	public static void main(String[] args) {
		// 1~100까지 수 중 2 또는 3의 배수를 제외한 수의 합
		int n, s;
		n = s = 0;
		
		// continue : while, do~while, for문에서 사용
		//(break => + switch)
		while(n < 100) {
			n++;
			if(n % 2 == 0 || n% 3 == 0) {
				continue;	// 다시 조건문 식으로 돌아감
			}
			
			s+=n;
		}
		
		
		// continue를 안쓰고 문제 푸는 법
//		while(n < 100) {
//			n++;
//			if(n % 2 != 0 || n% 3 != 0) {
//				continue;	// 다시 조건문 식으로 돌아감
//				s+=n;
//			}
//		}
//		
		
		System.out.println("결과 : " + s);

	}

}
