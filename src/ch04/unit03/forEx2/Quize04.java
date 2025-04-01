package ch04.unit03.forEx2;

public class Quize04 {

	public static void main(String[] args) {
		// 1-2+3-4+5....-10 = -5
		int s = 0;
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 1) {
				s += i;
				System.out.print(i + "-");
			} else {
				s -=i;
				System.out.print(i == 10 ? "=" : "+");
			}
		}
		System.out.println(s);
	}

}
