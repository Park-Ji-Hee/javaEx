package ch04.unit03;

public class Quize005 {

	public static void main(String[] args) {
		int n, s;
		
		n = s = 0;
		while(s <= 100) {
			n++;
			s+=n;
		}
		System.out.println("최소 n : " + n);
		System.out.println("합 : " + s);

	}

}
