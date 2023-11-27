package assignment_1;
//11:Check if number is a prime number or not.:
import java.math.*;
import java.util.Scanner;
public class Q_11 {

	public static void main(String[] args) {
		int number,flag=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to check prime or not:");
		number=sc.nextInt();
		for (int i=2;i<=(Math.sqrt(number)+1);i++) {
			if (number%i==0) {
				flag=0;
			}
			else {
				flag=1;
			}
		}
		if(flag==0) {
		   System.out.println("is prime");
		  
		}
		else {
			System.out.println("not prime");
		}

	}

}
