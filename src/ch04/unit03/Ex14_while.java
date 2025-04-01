package ch04.unit03;

public class Ex14_while {

	public static void main(String[] args) {
		// 1~100 사이의 수 중 3 또는 5의 배수
		
		/*
		int n=0, cnt=0;
		
		while(n<100) {
			n++;
			if(n%3!=0 && n%5!=0) {
				System.out.print(n + "\t");
				cnt++;
				if(cnt%5==0) {
					System.out.println();
				}
			}
		}
		*/
		
		int n=0, cnt=0;
		
		while(n<100) {
			n++;
			if(n%3!=0 && n%5!=0) {
				System.out.print(n + (++cnt % 5 == 0 ? "\n" : "\t"));	// ++cnt 주의하기!
			}
		}

	}

}
