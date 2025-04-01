package ch03.unit02;

public class Ex04 {

	public static void main(String[] args) {
		int a, b;
		boolean c;
		
		System.out.println("a:20, b:20");

		a = 20; b = 20;
		c = ++a > 20 && ++b > 20;
		System.out.println(a + "," + b + "," + c);
			// a=21, b=21, c=true
		
		a = 20; b = 20;
		c = a++ > 20 && b++ > 20;
		System.out.println(a + "," + b + "," + c);
			// a=21, b=20, c=false
		
		a = 20; b = 20;
		c = ++a > 20 && b++ > 20;
		System.out.println(a + "," + b + "," + c);
			// a=21, b=21, c=false
		
		a = 20; b = 20;
		c = ++a > 20 || ++b > 20;
		System.out.println(a + "," + b + "," + c);
			// a=21, b=20, c=true
		
		a = 20; b = 20;
		c = a++ > 20 || b++ > 20;
		System.out.println(a + "," + b + "," + c);
			// a=21, b=21, c=false
		
		a = 20; b = 20;
		c = ++a > 20 || b++ > 20;
		System.out.println(a + "," + b + "," + c);
			// a=21, b=20, c=true
		
	}

}
