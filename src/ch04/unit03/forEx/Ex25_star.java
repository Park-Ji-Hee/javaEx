package ch04.unit03.forEx;


//	    *
//	   ***
//	  *****
//	 *******
//	*********

public class Ex25_star {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// for 갯수를 줄여야 한다면 삼항연산자 쓰는걸 고려해볼 필요가 있음
		int s = 11; // 숫자 변경해서 삼각형 크기를 바꿀 수 있음
		for(int i=s/2+1; i<=s; i++) {
			for(int j=0; j<i; j++) {
					System.out.print((s-i) <= j ? "*": " ");
			}
			System.out.println();
		}
	}
		
}
