package ch04.unit03.forEx;

//	*********
//	 *******
// 	  *****
//	   ***
//	    *


public class Ex26_star2 {
	public static void main(String[] args) {
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
