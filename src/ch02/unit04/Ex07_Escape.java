package ch02.unit04;

public class Ex07_Escape {

	public static void main(String[] args) {
		//	확장열(문자열에서 표현할 수 없는 걸 표현?)
		System.out.println("a\tb\tc");	//	\t ***
		System.out.println("a\nb\nc");	//	\n ***
		System.out.println("x\\y");	//	\출력 ***
		System.out.println("\101");	//	8진수 101 =>	65 => A
		System.out.println("\u0043");	//	유니코드(u) 67 => C
		
	}

}
