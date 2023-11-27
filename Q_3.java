package assignment_1;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_1,number_2,temp_var;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		number_1=sc.nextInt();
		number_2=sc.nextInt();
		temp_var=number_1;
		number_1=number_2;
		number_2=temp_var;
		System.out.println("After Swapping numbers are:");
		System.out.println(number_1);
		System.out.println(number_2);
	}

}
