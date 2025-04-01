package ch05.unit01.sortEx;

public class Ex04_Insertion {

	public static void main(String[] args) {

		// Insertion sort
		int []num = new int[] {25, 15, 7, 4, 12, 9, 17, 16, 20, 13};
		int i, j , key;
		
		System.out.print("source data : ");
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		for(i =1 ; i < num.length; i++) {
			key = num[i];
			for(j = i-1; j >= 0; j--) { // i=1 j=0~0
				if(key < num[j]) {
					num[j+1] = num[j];
				} else {
					break;
				}
			}
			num[j+1] = key;
			
			/*
			System.out.print(i + "회전 : ");
			for(int n : num) {
				System.out.print(n + " ");
			}
				System.out.println();
				*/
			} 
			
			System.out.print("sort data : ");
			for(int n : num) {
				System.out.print(n + " ");
			}
			System.out.println();
		
	}

}
