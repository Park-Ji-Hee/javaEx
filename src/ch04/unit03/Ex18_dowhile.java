package ch04.unit03;

public class Ex18_dowhile {

	public static void main(String[] args) {
		int n;
		
//		n = 10;
//		while(n<10) { // 조건이 거짓으로 한번도 실행 하지 않음
//			n++;
//			System.out.println("while 안 : " + n);
//		}
//		System.out.println("while 밖 : " + n);
		
		n = 10;
		do { // 적어도 한 번은 실행 한다.
			n++;
			System.out.println("do~while 안 : " + n);	// 11
		} while(n<10); // 세미콜론(;) 여기다가 찍음
		System.out.println("do~while 밖 : " + n);	// 11

	}

}
