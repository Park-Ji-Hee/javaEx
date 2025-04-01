package ch04.unit03.forEx2;

public class Quize07 {
	public static void main(String[] args) {
		
		// 방법 1 
//		for(int i = 1; i <=9; i++) {
//			for(int j = 2; j <= 5; j++) {
//				System.out.printf("%d * %d = %d\t", j, i, i*j);
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		for(int i = 1; i <=9; i++) {
//			for(int j = 6; j <= 9; j++) {
//				System.out.printf("%d * %d = %d\t", j, i, i*j);
//			}
//			System.out.println();
//		}
		
		// 방법2
		int dan;
		for(int i = 0; i < 2 ; i++) {
			for(int j = 1; j <= 9; j++) {
				for( int k = 2; k <= 5; k ++) {
					dan = i * 4 + k; // 
					System.out.printf("%d * %d = %2d\t", dan, j, dan*j);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
