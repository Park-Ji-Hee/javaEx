package ch05.unit02;

/*
	1   2  3  4  5
	10  9  8  7  6
	11 12 13 14 15
	20 19 18 17 16
	21 22 23 24 25
*/

public class Ex05 {

	public static void main(String[] args) {
		int [][]a = new int[5][5];
		int n = 0;
		
		for(int i = 0 ; i < 5 ; i++) {		
			for(int j = 0 ; j < 5; j++) {
				n++;	// 1씩 증가 될 수 밖에 없음...왜?
				if(i%2 == 0) {
					a[i][j] = n;
				} else {
					a[i][4-j] = n;	// 거꾸로 나열되므로
				}
			}
		}

		for(int i = 0 ; i < a.length; i++) {		
			for(int j = 0 ; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}

	}

}
