package ch04.unit03;

public class Ex02_while {

	public static void main(String[] args) {
		
		
//		int n = 0;	// 선언과 동시에 초기화
//		while(n++ < 10 ) {
//			System.out.print(n + " ");	// 1 2 3 4 .. 9 10
//		} 
//		System.out.println();
//		System.out.println("while 밖 n : " + n); // 11
		
		
	
//		int n = 0;	// 선언과 동시에 초기화
//		while(++n < 10 ) {
//			System.out.print(n + " ");	// 1 5 9 
//			n += 3;	// 반복횟수에 사용한 변수의 값을 변경하면 반복횟수가 바뀜
//		} 
//		System.out.println();
//		System.out.println("while 밖 n : " + n); // 13
		
		
		
		// gpt 예시
//		int n = 0;	// 선언과 동시에 초기화
//		while(n++ < 10 ) {
//			System.out.print(n + " ");	// 1 5 9 
//			n += 3;	// 반복횟수에 사용한 변수의 값을 변경하면 반복횟수가 바뀜
//		} 
//		System.out.println();
//		System.out.println("while 밖 n : " + n); // 13
//		*/
		
		
		int n = 10;
		while(n++ < 10 ) { // 처음 조건식이 거짓이면 while 안은 한 번도 실행 않함
			System.out.println("while 안 : " + n + " ");	
		} 
		System.out.println();
		System.out.println("while 밖 : " + n);	// 11
	}

}
