package ch04.unit03.forEx;

public class Ex06 {

	public static void main(String[] args) {
		int s, n;
		// , 를 이용하여 여러 구무 나열
		for(n = 1, s = 0 ; n <= 10; s+=n, n++);
		System.out.println("결과: "+s);
		
		// 잘못 작성한 예
		s = 0;
		for(n = 1; n <= 10; n++); // ;넣어버리면 괄호 안에서 반복되기만 함
			s+=n;
		System.out.println(n + ";" + s); 	// 11, 11

	}

}
