package assignment_1;

import java.util.Scanner;

public class Q_5 {

	public static void main(String[] args) {
		int number_1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number:");
		number_1=sc.nextInt();
		if ((number_1%5==0)&&(number_1%7==0)) {
			System.out.println("number is divisible by 5 & 7");
		}
		else {
			System.out.println("number is not divisible by 5 & 7");
		}
	}

}
