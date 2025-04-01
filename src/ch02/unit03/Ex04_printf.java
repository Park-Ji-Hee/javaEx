package ch02.unit03;

/*
	
*/

public class Ex04_printf {

	public static void main(String[] args) {
		System.out.printf("%d", 123);	// 출력 후 라인을 넘기지 않음
		System.out.printf("%d\n", 456);

		System.out.printf("%d*\n", 123);
		System.out.printf("%10d*\n", 123);	// 공백 7칸 생김
		System.out.printf("%010d*\n", 123);	// 공백 7칸 생김 + 공백 0으로 채워짐
		
		// System.out.printf("%d\n", 'A');	// 런타임 오류	// %d == 정수의미 ==> 문자 A를 주었기 때문에 "런타임 오류"가 발생함
			// 문자는 %d로 출력 불가
		//	System.out.printf("%d\n", 2200000000);	// 컴파일 오류
			// 22억은 int가 아님
		
		System.out.println();
		
		System.out.printf("%,d\n", 123456);	// 세자리마다 , 
		System.out.printf("%+d %+d\n", 123, -123);	
			// 양수도 + 기호 출력
		System.out.printf("%(d %(d\n", 123, -123);	
			// 음수는 () 안에 출력
		System.out.printf("%-10d*\n", 123);	
			// 좌측 정렬 (공백이 우측에)
			// System.out.printf("%10d*\n", 123);	
			// 우측 정렬 (공백이 좌측에)	

		System.out.printf("%f\n", 123.456);	// 123.45600
		System.out.printf("%.1f\n", 123.456);	// 123.5	// 반올림 값으로 나옴
		System.out.printf("%5.0f %5.0f\n", 15.3, 15.7);	//	15	16 // 소수점 이하는 반올림 함
		System.out.println();
		
		System.out.printf("%c\n", 'A');	// 한문자
		System.out.printf("%c\n", 'a');
		System.out.printf("%c %C\n", 'a', 'a');	// 'a' 'A'
			// %C	: 소문자를 대문자로 출력
		System.out.printf("%c %c\n", 65, 97);	// 'A' 'a'	// 런타임 오류가 아님
			// ASCHII  코드에 해당하는 문자 출력
		
		
	}

}
