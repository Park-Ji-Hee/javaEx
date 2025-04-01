package ch04.unit03;

public class Ex01_while {

	public static void main(String[] args) {
		/* 경우1
		int n;
		n=0;	// 반드시 초기화 필요
		
		while(n<10) {
			n++;
			System.out.print(n + " ");	// 1 2 3 4 .. 10
		}
		System.out.println();
		System.out.println("while 밖 n : " + n);	// 10
		*/
		
		
		/*경우2
		int n = 0;	// 선언과 동시에 초기화
		while(n++ < 10 ) {
			System.out.print(n + " ");	// 1 2 3 4 .. 9 10
		} 
		
		System.out.println();
		System.out.println("while 밖 n : " + n);	// 11 (비교할때는 그냥 n, 괄호를 나갈때는 ++ 해줘야함)
		*/
		
		
		//경우3
		int n = 0;	// 선언과 동시에 초기화
		while(++n < 10 ) {
			System.out.print(n + " ");	// 1 2 3 4 .. 9
		} 
		
		System.out.println();
		System.out.println("while 밖 n : " + n); // 10
		
	}

}
