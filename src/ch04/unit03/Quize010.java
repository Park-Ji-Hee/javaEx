package ch04.unit03;

public class Quize010 {

	public static void main(String[] args) {

		int a, b;
		
		a = 0;
		while(a<9) {	// 단
			a++;
			
			b = 1;	
			while(b<9) {	// 곱하는 수
				b++;
				System.out.printf("%d * %d = %2d", b, a, b*a);
			}
			System.out.println();	
		}
	}

}
