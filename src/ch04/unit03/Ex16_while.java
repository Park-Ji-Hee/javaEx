package ch04.unit03;

public class Ex16_while {

	public static void main(String[] args) {
		int n=0, s=0;
		
		while(true) {	// 무한 loop
			n++;
			s += n;
			if(n == 10) {	// while 문을 빠져 나감
				break;
			}
		}
		System.out.println("결과 : " + s);
	}

}
