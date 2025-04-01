package ch05.unit02;

public class Quize02 {

	public static void main(String[] args) {
		
		int [][]a = new int[5][5];
		char n = 'A';	// 65라고 써도 됨
		
		for(int i = 0 ; i < a.length; i ++) { // 열
			for(int j =  a[i].length-1 ; j >= 0; j--) { // 행
				a[j][i] = n++;	// ++가 뒤로 가야됨
			}
		}
		
		for(int i = 0 ; i < a.length; i++) {		
			for(int j = 0 ; j < a[i].length; j++) {
				System.out.printf("%3c", a[i][j]);
			}
			System.out.println();
		}

	}

}
