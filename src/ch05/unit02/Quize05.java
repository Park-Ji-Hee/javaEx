package ch05.unit02;

public class Quize05 {

	public static void main(String[] args) {
		int [][]num = new int[5][5];
		int n=0, k;
		
		for(int i = 0; i <9; i++) { // 0~8까지 반복(8번 반복해야하므로)	// 열
			for(int j = 0; j < 5 ; j++) {	// 행
				k = i - j;
				if(k < 0 || k> 4) {
					continue;
				}
				num[j][k] = ++n;
			}
		}
		
		for(int i = 0 ; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
				System.out.printf("%3d", num[i][j]); 
			}
			System.out.println();
		}

	}

}
