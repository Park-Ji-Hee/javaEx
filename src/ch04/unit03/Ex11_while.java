package ch04.unit03;

public class Ex11_while {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)...+(1+2+3+...+9+10)
		
//		int n=0, s=0;
//		while(n<10) {
//			n++;
//			s += (s+n);
//		}
		
		
		int n, s, a;
		 n= s = a = 0;
		while(n<10) {
			n++;
			s += n;
			a += s;
		}
		
		System.out.println("결과:" + a);
	}

}
