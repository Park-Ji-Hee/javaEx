package ch04.unit03.forEx;

public class Quize10 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if(i%4 == 0 && i%6 ==0) {
				System.out.println(i + " ");
			}
		}
		System.out.println();
	}
}
