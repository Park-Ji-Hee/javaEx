package ch03.unit03;

public class Ex02 {
	public static void main(String[] args) {
		int a = 23;
		int key = 1234;
		
		// 암호화에서 활용
		
		a = a ^ key;
		System.out.println(a);	// 1221 : 암호화
		
		a = a ^ key;
		System.out.println(a);	// 23	: 복호화
	}
}
