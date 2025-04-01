package ch04.unit01;

import java.util.Scanner;

public class Quize03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 ? ");
		char w1 = sc.next().charAt(0);
		
		char w2 =0;
		if(w1 >= 'A' && w1 <= 'Z') {
			w2 = (char)(w1 + 32);
		} else if (w1 >= 'a' && w1 <= 'z') {
			w2 = (char)(w1 - 32);
		}
		
		/* 다른 방법
		 	w2 = w1
		 	if(w1 >= 'A' && w1 <= 'Z') {
				w2 += 32;
			} else if (w1 >= 'a' && w1 <= 'z') {
				w2 -= 32;
			}
		
		 */
		
		System.out.println(w1 + " =? " + w2);
		
		sc.close();
	}

}
