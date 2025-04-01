package ch04.unit03;

public class Quize003 {

	public static void main(String[] args) {
		
		char ch = 'A';
		int n = 0;
		
		while(ch <= 'Z') {
			System.out.print(ch + "\t");
			
			n++;
			if(n%5 ==0) {
				System.out.println();
			}
			ch++;
		}
		System.out.println();
	}

}
