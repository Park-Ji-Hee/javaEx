package ch03.unit01;

public class Ex13 {

	public static void main(String[] args) {
		char a;
		
		a = 'A';
		//	a = a + 1	// 컴파일 오류
		// 	a = (char)(a+1);	// 형변환 시키면 컴파일 오류가 발생하지 않음
		a++;	//	++a;도 가능, ++와 --는 형변환이 일어나지 않는다. => 속도가 빠름
		System.out.println(a);

		a = 'A';
		System.out.println(a++ + "," + ++a); 	// A, C
		
	}
}
