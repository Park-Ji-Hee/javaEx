package ch03.unit01;

/*
 	1) 자바는 정수의 연산을 기본 타입은 int
 	2) +, -, *, /, % 연산의 피연산자가 byte, short, char이면 int로 변환하여 연산한다.
 	3) 피 연산자가 리터널인 경우 형변환이 일어나지 않는다.
 */

public class Ex02 {

	public static void main(String[] args) {
		short s1, s2, s3;
		s1 = 10;
		s2 =15;
		//s3 = s1 + s2;	// 컴파일 오류 (합한 값인 int형이기 때문에 작은 short에 넣을 수 없음)
		// short형 + short형 => int형 + int형 => int형
		s3 = (short)(s1 + s2);
		System.out.println(s3);

		char ch = 'A';
		//	ch = ch + 10;	// 컴파일 오류
			//	char형 + int형 => int형 + int형 => int형
		ch = (char)(ch+10);
		System.out.println(ch);	//	'K'
		
		ch = 'A' + 5;	//	리터널은 형변환이 일어나지 않는다
		System.out.println(ch);	//	'F'
		
		double d;
		d = 'A' + 10;
		System.out.println(d);	// 75.0
		
		
		
	}

}
