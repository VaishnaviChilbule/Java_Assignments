//Write a program to accept a character, an integer n and display the next n characters.
package assignment_2;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		char c;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter character:");
		c = sc.next().charAt(0);
		System.out.println("enter the number:");
		n = sc.nextInt();
		if (Character.isLowerCase(c)) {
			for (int i = 1; i <= n; i++) {
				int ascii = (int) c;
				ascii = ascii + i;
				char c_new = (char) ascii;
				System.out.println(c_new);
			}
		} else if (Character.isUpperCase(c)) {
			for (int i = 1; i <= n; i++) {
				int ascii = (int) c;
				ascii = ascii + i;
				char c_new = (char) ascii;
				System.out.println(c_new);
			}

		} else {
			System.out.println("enter valid character");
		}

	}

}
