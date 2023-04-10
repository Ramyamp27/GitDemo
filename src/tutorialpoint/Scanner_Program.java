package tutorialpoint;

import java.util.Scanner;

public class Scanner_Program {

	public static void main(String[] args) {

		// String s = "In order to use this method, a Scanner object needs to be
		// created.";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string ");
	
		String next = sc.next();
		
		System.out.println(next);

		char charAt = sc.next().charAt(2);
		
		System.out.println(charAt);

	}

}
