package ch02.unit03;

/*
 	- System.out.printf("출력서식", 출력할값, 출력할 값)
 		: 출력 서식에 따라 값을 출력
 		: 출력 후 라인을 넘기지 않는다. (== print 같음)
 		: System.out.format("출력서식", 출력할값, 출력할 값)와 동일		
*/

public class Ex03_printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c; //	정수형 변수
		a = 13;
		b = 4;
		c = a + b;
		
		System.out.println(a + " + " + b + " = " + c);	// 13 + 4 = 17
		
		System.out.printf("%d + %d = %d\n", a, b, c);	// 13 + 4 = 17
		System.out.format("%d + %d = %d\n", a, b, c);	// 13 + 4 = 17
		System.out.println();
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);	// 합
		System.out.printf("%d - %d = %d\n", a, b, a-b);	// 차
		//	System.out.printf("%d - %d = %d\\n", a, b, a-b);	// 13 - 4 = 9\n13 * 4 = 52
		System.out.printf("%d * %d = %d\n", a, b, a*b);	// 곱
		System.out.printf("%d / %d = %d\n", a, b, a/b);	// 몫
		System.out.printf("%d %% %d = %d%n", a, b, a%b);	// 나머지
			// %	: 형식지정 제어문자의 시작
			// %d	: 정수를 출력
			// \n, %n	: 라인을 넘김  (c언어에서는 %n은 안됨)
			// %%	: %가 형식 문자가 아닌 %를 출력할 경우 사용
		
		
		
	}
}
