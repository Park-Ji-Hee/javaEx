package ch05.unit02;

public class Quize08 {

	public static void main(String[] args) {
		
		// 마방진
		int n = 5;
		int[][]num = new int[n][n]; // 홀수만 가능

		int row, col;
		
		row = 0;	// 1이 0행에 있으므로
		col = n/2;	// 1이 중간에 있으므로
		
		for(int i = 1; i <= n*n; i++) {
			num[row][col] = i;
			
			if(i % n ==0) {
				row++;	// 5로 나눠질 때 행 1개 증가
			} else {
				row--;
				col++;
			}
			
			if(row < 0) {
				row = n -1;
			}
			
			if(col >= n) {
				col = 0;
			}
		}
		for(int i =0; i<num.length; i++) {
			for(int j =0; j<num[i].length; j++) {
				System.out.printf("%5d", num[i][j]);
			}
			System.out.println();
		}
	}

}
